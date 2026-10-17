package ru.mirea.pr41.matrix;

import java.util.Arrays;

public class Matrix {
    private final double[][] data;
    private final int rows;
    private final int columns;

    public Matrix(double[][] data) {
        if (data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Матрица не должна быть пустой");
        }
        rows = data.length;
        columns = data[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            if (data[i].length != columns) {
                throw new IllegalArgumentException("Строки должны иметь одинаковую длину");
            }
            this.data[i] = Arrays.copyOf(data[i], columns);
        }
    }

    public int getRows() { return rows; }
    public int getColumns() { return columns; }
    public double get(int row, int column) { return data[row][column]; }

    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать");
        }
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(double number) {
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = data[i][j] * number;
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно совпадать с числом строк второй");
        }
        double[][] result = new double[rows][other.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result[i][j] += data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public void print() {
        for (double[] row : data) { System.out.println(Arrays.toString(row)); }
    }
}

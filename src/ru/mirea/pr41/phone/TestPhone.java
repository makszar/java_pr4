package ru.mirea.pr41.phone;

public class TestPhone {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("+79000000001", "Samsung", 190),
                new Phone("+79000000002", "Apple"), new Phone()};
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.receiveCall("Максим");
            System.out.println(phone.getNumber());
            phone.receiveCall("Анна", "+79000000003");
            phone.sendMessage("+79000000004", "+79000000005");
        }
    }
}

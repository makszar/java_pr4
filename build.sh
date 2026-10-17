#!/usr/bin/env sh
set -eu
cd "$(dirname "$0")"
mkdir -p out
find src -name '*.java' > out/sources.txt
javac -encoding UTF-8 -d out @out/sources.txt

package ru.geekbrains.homeworks;

public class ArrayDataExemption extends Exception {

    public ArrayDataExemption(int row, int col) {
        super(String.format("Parse to int exception in array[%d, %d]", row, col));
    }
}

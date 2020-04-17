package ru.geekbrains.homeworks;

public class ArrayDataExemption extends Exception {

    public ArrayDataExemption(String message) {
        super("Данные в массиве не верны");
    }
}

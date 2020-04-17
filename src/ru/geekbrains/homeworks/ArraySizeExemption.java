package ru.geekbrains.homeworks;

public class ArraySizeExemption extends Exception {

    public ArraySizeExemption(String message) {
        super("Размер массива не верен");
    }
}

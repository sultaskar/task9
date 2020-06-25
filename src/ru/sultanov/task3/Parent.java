package ru.sultanov.task3;

public class Parent extends Human {
    @Override
    public String runExpression() {
        return ("Я родитель и могу бегать");
    }

    @Override
    public String swimExpression() {
        return ("Я родитель и могу плавать");
    }
}

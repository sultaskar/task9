package ru.sultanov.task3;

public class Child extends Human {

    @Override
    public String runExpression() {
        return ("Я ребенок и могу бегать");
    }

    @Override
    public String swimExpression() {
        return ("Я ребенок и могу плавать");
    }
}

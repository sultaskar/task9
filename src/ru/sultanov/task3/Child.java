package ru.sultanov.task3;

public class Child extends Human {

    @Override
    public String run() {
        return ("Я ребенок и могу бегать");
    }

    @Override
    public String swim() {
        return ("Я ребенок и могу плавать");
    }
}

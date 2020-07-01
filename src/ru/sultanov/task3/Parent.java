package ru.sultanov.task3;

public class Parent extends Human {
    @Override
    public String run() {
        return ("Я родитель и могу бегать");
    }

    @Override
    public String swim() {
        return ("Я родитель и могу плавать");
    }
}

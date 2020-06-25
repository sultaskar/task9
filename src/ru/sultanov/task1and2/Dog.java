package ru.sultanov.task1and2;

import ru.sultanov.Run;
import ru.sultanov.Swim;

public class Dog extends Animal implements Run, Swim {

    //реализация первого задания
    @Override
    public String getName() {
        return ("Собака");
    }

    @Override
    public String runExpression() {
        return ("Я собака и я могу бегать");
    }

    @Override
    public String swimExpression() {
        return ("Я собака и я могу плавать");
    }
}

package ru.sultanov.task1and2;

import ru.sultanov.Fly;
import ru.sultanov.Run;

public class Bird extends Animal implements Fly, Run {

    //реализация первого задания
    @Override
    public String getName() {
        return ("Птица");
    }

    //реализация второго задания
    @Override
    public String fly() {
        return ("Я птица и я могу летать");
    }

    @Override
    public String run() {
        return ("Я птица и я могу бегать");
    }
}

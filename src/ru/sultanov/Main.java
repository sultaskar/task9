package ru.sultanov;

import ru.sultanov.task1and2.*;
import ru.sultanov.task3.*;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getName());
        System.out.println(dog.runExpression());
        System.out.println(bird.getName());
        System.out.println(bird.flyExpression());
        System.out.println(bird.runExpression());

        Child child = new Child();
        Parent parent = new Parent();
        System.out.println(child.runExpression());
        System.out.println(parent.swimExpression());

    }
}

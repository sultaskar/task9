package ru.sultanov;

import ru.sultanov.task1and2.*;
import ru.sultanov.task3.*;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getName());
        System.out.println(dog.run());
        System.out.println(bird.getName());
        System.out.println(bird.fly());
        System.out.println(bird.run());

        Child child = new Child();
        Parent parent = new Parent();
        System.out.println(child.run());
        System.out.println(parent.swim());

    }
}

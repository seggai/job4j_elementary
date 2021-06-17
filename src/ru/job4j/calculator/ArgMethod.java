package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello2(int first) {
        System.out.println("Your age is: " + first);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello2(age);

        ArgMethod.hello(name);

        ArgMethod.hello2(age);

        ArgMethod.hello(name);
    }
}

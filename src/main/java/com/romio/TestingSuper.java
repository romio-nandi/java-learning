package com.romio;


class Parent {
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }

    public int getNumber() {
        return 1;
    }
}


class Child extends Parent {

    public static void staticMethod() {
        System.out.println("Child's static method");
    }

    public int getNumber() {
        return 2;
    }

}


public class TestingSuper {
    public static void main(String[] args) {
        Parent.staticMethod();
        Child.staticMethod();
    }
}
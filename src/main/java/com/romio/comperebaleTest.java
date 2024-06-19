package com.romio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class comperebaleTest implements Comparable<comperebaleTest> {
  private  int rollNumber;

   private String name;
   private int age;


    public comperebaleTest(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;

    }


    @Override
    public int compareTo(comperebaleTest com) {
        return this.rollNumber - com.rollNumber;
    }

    @Override
    public String toString() {
        return "comperebaleTest{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                 '\'' +
                '}';
    }




    public static void main(String[] args) {
        List<comperebaleTest> l=new ArrayList<>();
        comperebaleTest obj1= new comperebaleTest(2,"romio",25);
        comperebaleTest obj2= new comperebaleTest(90,"rahul",28);
        comperebaleTest obj3= new comperebaleTest(1,"deepak",29);
        l.add(obj1);
        l.add(obj2);
        l.add(obj3);
        Collections.sort(l);
        System.out.println(l.toString());

    }
}

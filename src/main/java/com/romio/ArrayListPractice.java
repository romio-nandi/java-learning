package com.romio;


import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> obj= new ArrayList<>();
        obj.add(15);
        obj.add(20);
        obj.add(25);
        boolean ans = obj.contains(80);
        if (ans){
            System.out.println("yes ");

        }
        else {
            System.out.println("no");
        }

    }



}

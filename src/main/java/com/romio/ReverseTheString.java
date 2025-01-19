package com.romio;

public class ReverseTheString {
   
    public char[] name( String input){
        int j=0;
        char[] reverse=new char[input.length()];
        for(int i=input.length()-1;i>=0;i--){
            reverse[j] = input.charAt(i);
             j++;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseTheString rv=new ReverseTheString();
        System.out.println(rv.name("null is not zero"));
    }


}

package com.romio;

class  Parent0 {
    String name;
    int rollNumber;
    String address;

    static int some;

    static {
        some = 5;
    }
    public Parent0(String name, int rollNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    public void Method1() {
        System.out.println("parante's static method");
    }
}

public class DataOverRiddingPractice extends Parent0 {

    String schoolName;

    public DataOverRiddingPractice(String name, int rollNumber, String address, String schoolName) {
        super(name, rollNumber, address);
        this.schoolName = schoolName;
    }


    @Override
    public void Method1() {
        System.out.println("child's static method");
        super.Method1();
        String name=super.name;

    }

    public static void main(String[] args) {
        DataOverRiddingPractice obj = new DataOverRiddingPractice("romio",121,"fgf","gtgt");
           obj.Method1();
           String add=obj.address;
        System.out.println(add);



    }
}

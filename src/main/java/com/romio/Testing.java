package com.romio;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


class Sample {
    public void getSample(Student objstudent) {
        System.out.println(objstudent.getName());
        objstudent.setName("sayani");
        System.out.println(objstudent.getName());


    }


}

public class Testing {
    public static void main(String[] args) {
        Sample sample = new Sample();

        sample.getSample(new Student("jonny"));
    }

}

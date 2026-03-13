package ObjectOrientedProgramming;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private float marks;

    public Student () {}

    public Student (String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return  rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter your name: ");
        student.name = sc.nextLine();
        System.out.println("Name: " + student.getName());

        student.setName("Developer");
        System.out.println("Your are also: " + student.getName());

        student.setRollNumber(15);
        System.out.println("Roll number: " + student.getRollNumber());

        student.setMarks(99.5f);
        float printMarks = student.getMarks();
        System.out.println("Your marks: " + printMarks);


    }
}

package Homework5;

public class Student extends Person {

    double score;
    Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score=score;
    }
    public void showStudentInfo(){
        if (isMan) {
            System.out.println(name+" is a "+age+" years old "+",is a "+"male"+" and has a score "+score);
        } else {
            System.out.println(name+" is a "+age+" years old "+",is a "+"female"+" and has a score "+ score);
        }

    }
}
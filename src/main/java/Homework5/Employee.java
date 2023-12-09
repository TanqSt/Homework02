package Homework5;

public class Employee extends Person {
    int daySalary;

    Employee(String name, int age, boolean isMan, int daySalary) {
        super(name, age, isMan);
        this.daySalary=daySalary;
    };
    public void calculateOvertime(double hours){
        double salaryPerHour=daySalary/8.0;
        double overSum=salaryPerHour*hours;

        if(age>=18){
            overSum=salaryPerHour*hours;
            System.out.println("Sum for overtime work is :"+overSum);
        }
        else{
            overSum=0;
        }
    }
        public void showEmployeeInfo(){
            if (isMan == true) {
                System.out.println(name+" is a "+age+" years old "+"male."+" The day salary is:"+daySalary);
            } else {
                System.out.println(name+" is a "+age+" years old"+"female."+" The day salary is:"+daySalary);
            }


        }

    }


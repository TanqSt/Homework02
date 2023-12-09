package Homework5;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Person[]numbers =new Person[10];
        Person p=new Person("John", 25, true);
        Person p1=new Person("Mary", 53, false);
        Student s=new Student("Viki",22,true,43.7);
        Student s1=new Student("Mimi",23, false,40.5);
        Employee e=new Employee("George", 35, true, 60);
        Employee  e1=new Employee("Ivan", 33, true, 78);

        numbers[0]=p;
        numbers[1]=p1;
        numbers[2]=s;
        numbers[3]=s1;
        numbers[4]=e;
        numbers[5]=e1;



        if(p instanceof Person || p1 instanceof Person){
            p.showPersonInfo();
            p1.showPersonInfo();

        }
        if (s instanceof Student || s1 instanceof Student) {
            s.showStudentInfo();
            s1.showStudentInfo();
        }
        if (e instanceof Employee || e1 instanceof Employee) {
            e.showEmployeeInfo();
           e1.showEmployeeInfo();
        }
        if(e instanceof Employee || e1 instanceof Employee){
        e.calculateOvertime(2);
        e1.calculateOvertime(2);}
        {

        }
    }
}

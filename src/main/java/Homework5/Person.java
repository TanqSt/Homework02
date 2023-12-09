package Homework5;

public class Person {
    String name;
    int age;
     boolean isMan;


   public Person(String name, int age, boolean isMan){
        this.name=name;
        this.age=age;
        this.isMan=isMan;

    }


    public void showPersonInfo(){

        if (isMan == true) {
            System.out.println(name+" is a "+ age+" years old "+" and is a "+" male");
        } else {
            System.out.println(name+" is a "+age+" years old "+" and is a "+" female");
        }




    }

}



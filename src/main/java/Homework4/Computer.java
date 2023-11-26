package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;
    public Computer(int year, double price, String operationSystem){
        this.year=year;
        this.price=price;
        this.operationSystem=operationSystem;
    }
    public Computer(){

    }
    public int comparePrice(Computer compare) {
        int finish;

        if (compare.price > this.price) {
            finish=-1;
        } else if (compare.price < this.price) {
            finish= 1;
        } else {
            finish=0;
        }
          return finish;
        }
    }
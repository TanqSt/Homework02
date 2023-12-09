package Homework6;

public class Cat extends Animal implements IAnimal{
    @Override
    public void play(){
        System.out.println("The cat plays with a ball.");
    }
    @Override
    public void makeSomeNoise(){
        System.out.println("The cat says:Miay.");
    }
    public void climb(){
        System.out.println("The cat climbs the tree.");
    }

}

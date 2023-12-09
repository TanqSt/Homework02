package Homework6;

public class Dog extends Animal implements IAnimal {
    @Override
    public void play(){
        System.out.println("The dog jumps high.");
    }
    @Override
    public void makeSomeNoise(){
        System.out.println("The dog says:Bay bay.");
    }
    public void bringStick(){
        System.out.println("The dog brings a stick.");
    }
}

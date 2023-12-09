package Homework6;

class Bird extends Animal implements IAnimal{
    public void fly(){
        System.out.println("The bird is flying fast.");
    }
    @Override
    public void play(){
        System.out.println("The bird jumps on the branch.");
    }
    @Override
    public void makeSomeNoise(){
        System.out.println("The bird says:Chikchirik.");
    }
    public void sing(){
        System.out.println("The bird is singing.");

    }
    public void sing(int numberBirds){
        System.out.println(numberBirds+" birds are singing loudly.");
    }

}
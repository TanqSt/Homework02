package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();
        d.makeSomeNoise();
        d.play();
        c.play();
        c.makeSomeNoise();
        b.play();
        b.makeSomeNoise();
        c.climb();
        d.bringStick();
        b.sing();
        b.sing(2);

    }
}

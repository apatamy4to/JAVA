package Lesson6.Animal;

public class Cat extends Animal {
    public Cat(String name, int maxSwim, int maxRun, double maxJump) {
        super(name, maxSwim, maxRun, maxJump);
        this.type = "Кошка:";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Кошка не умеет плавать.");
    }
}

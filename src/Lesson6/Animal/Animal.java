package Lesson6.Animal;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public Animal(String name, int maxSwim, int maxRun, double maxJump) {
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) {
            System.out.println(this.type + " " + this.name + " бежит: " + dist + " m.");
        } else {
            System.out.println(this.type + " " + this.name + " не может бежать так далеко.");
        }
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) {
            System.out.println(this.type + " " + this.name + " плывет: " + dist + " m.");
        } else {
            System.out.println(this.type + " " + this.name + " не может плыть так далеко.");
        }
    }

    public void jump(double height) {
        if (this.maxJump >= height) {
            System.out.println(this.type + " " + this.name + " прыгает: " + height + " m.");
        } else {
            System.out.println(this.type + " " + this.name + " не может прыгать так высоко.");
        }
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " Бегает: " + this.maxRun + " m., Плавает: " + this.maxSwim + " m., Прыгает: " + this.maxJump + " m.");
    }

}
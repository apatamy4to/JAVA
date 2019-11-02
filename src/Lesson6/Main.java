package Lesson6;

import Lesson6.Animal.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Margo", 0, 200, 2),
                new Dog("Bobik", 10, 600, 0.5),
                new Dog("Sharik", 10, 400, 0.5)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].info();
            animals[i].run(500);
            animals[i].swim(5);
            animals[i].jump(2);


        }

    }

}




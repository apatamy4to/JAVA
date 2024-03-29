package Lesson;

import java.util.Random;
import java.util.Scanner;

//Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class Lesson3 {
    private static Random random = new Random();

    public static void main(String[] args) {
        guessTheNumber();
    }

    private static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = random.nextInt(10);
            System.out.println("Угадайте загаданое число от 0 до 9. У Вас 3 попытки.");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ: ");
                int questionNum = scanner.nextInt();
                if (questionNum == numComp) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                }
                System.out.println(numComp > questionNum ? "Введенное чилсо больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " у Вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        }
        while (scanner.nextInt() == 1);
    }
}

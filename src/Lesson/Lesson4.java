package Lesson;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    static final int SIZE = 5;
    static final char DOT_TO_WIN = 4;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanMove();
            printMap();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(DOT_X)) {
                System.out.println("Поздравляю вы победили!");
                break;

            }
            computerMove();
            printMap();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(DOT_O)) {
                System.out.println("Машина оказалась сильнее.");
            }
        }
        System.out.println("Игра закончена!");

    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("   ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void humanMove() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!cellCheck(y, x));
        map[y][x] = DOT_X;
    }

    static boolean cellCheck(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE || y > SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static void computerMove() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!cellCheck(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkLine(int cy, int cx, int vy, int vx, int dot) {
        int lineX = cx + (DOT_TO_WIN - 1) * vx;
        int lineY = cy + (DOT_TO_WIN - 1) * vy;
        if (lineX < 0 || lineY < 0 || lineX > SIZE - 1 || lineY > SIZE - 1) {
            return false;
        }
        for (int i = 0; i < DOT_TO_WIN; i++) {
            int itemY = cy + i * vy;
            int itemX = cx + i * vx;
            if (map[itemY][itemX] != dot) {
                return false;
            }

        }
        return true;
    }

    static boolean checkWin(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, dot))
                    return true;
                if (checkLine(i, j, 1, 1, dot))
                    return true;
                if (checkLine(i, j, 1, 0, dot))
                    return true;
                if (checkLine(i, j, -1, 1, dot))
                    return true;
            }
        }
        return false;
    }
}

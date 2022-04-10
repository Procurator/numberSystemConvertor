package test_A;

import java.util.Scanner;

public class neoStudy {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите номер команды из следующего меню:\n" +
                    "1. Конвертация числа из 10-ой в 2-ую систему исчисления\n" +
                    "2. Конвертация числа из 10-ой в 16-ую систему исчисления\n" +
                    "3. Конвертация числа из 2-ой в 10-ую систему исчисления\n" +
                    "4. Exit");
            int command = new Scanner(System.in).nextInt();
            System.out.println("Введите число");
            int number = new Scanner(System.in).nextInt();
            switch (command) {
                case 1:
                    convert10to2(number);
                    break;
                case 2:
                    convert10to16(number);
                case 3:
                    convert2to10(number);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Такой команды пока нет");

            }
        }
    }

    static void convert10to2(int number) {
        int divider = 2;
        String answer = "";
        while (number > 0) {
            int a = number % divider;
            answer = a + answer;
            number /= divider;
        }
        System.out.println(answer);
    }

    static void convert10to16(int number) {
        int divider = 16;
        String answer = "";
        while (number > 0) {
            int a = number % divider;
            if (a < 10) {
                answer = a + answer;
            } else {
                String[] alphabet = {"A", "B", "C", "D", "E", "F" };
                answer = alphabet[a-10] + answer;
            }
            number /= divider;
        }
        System.out.println(answer);
    }
    static void convert2to10(int number) {
        int answer = 0;
        int counter = 0;
        while (number > 0) {
            int a = number % 10;
            answer += (int) Math.pow((a*2),counter);
            number /= 10;
            counter++;
        }
        System.out.println(answer);
    }
}


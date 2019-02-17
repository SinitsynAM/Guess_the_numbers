package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число.");
        int range = 15;
        int number = (int)(Math.random() * range);
        while (true){
            System.out.println("Угадайте число от 0 до " + range);
            System.out.println("Введите число: ");
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Поздрвляю,-Вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
                    }
        System.out.println("Загаданное число: " + number);
        scanner.close();
    }
}

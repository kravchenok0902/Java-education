package ru.kravchenko.stepik;

import java.util.Scanner;

public class Assistant {
    public static void main(String[] args) {
        // создай мне новый сканер (new Scanner), который будет доставать данные из консоли (System.in)
        // присвой новый сканер переменной scanner
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String assistantName = scanner.nextLine();
        int messageCount = scanner.nextInt();
        // Привет, Илон Маск, это твой помощник Рогозин.
        // У тебя 19 новых писем.
        System.out.println("Привет, " + name + "," + " это твой помощник " + assistantName + ".");
        System.out.println("У тебя " + messageCount + " новых писем" + ".");
    }
}

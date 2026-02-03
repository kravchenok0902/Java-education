package ru.kravchenko;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напиши свою зарплату до вычета налогов");
        int salary = sc.nextInt();
        double salaryAfterTaxes = salary * 0.87;
        System.out.println("Твоя зарплата после вычета налогов: " + salaryAfterTaxes);
    }

}

package ru.kravchenko;

public class Operators {

    public static void main(String[] args) {
        int x = 10;
        x = x + 1; // 11
        ++x; // 12, тоже самое, что и x = x + 1
        --x; // 11, тоже самое, что и x = x - 1
        x = 21; // 21
        System.out.println(x);
        System.out.println(21 / 5); // 4
        System.out.println(21 % 5); // 1 - остаток от деления
        System.out.println(21. / 5); // 4.2, . означает, что число с дробной частью
        System.out.println(21 / 5.); // 4.2, тоже самое что выше

        String s = "123";
        s = s + "4";
        System.out.println(s); // 1234
    }
}

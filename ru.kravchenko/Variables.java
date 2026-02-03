package ru.kravchenko;

public class Variables {
    public static void main(String[] args) {
        // Возможность вывода в консоль
        System.out.println("123"); // Комментарий можно написать и тут
        System.out.println(123 * 2);

        // ; - конец команды

        // Примитивные типы данных
        // основные
        boolean b = true; // true или false
        int a = 2147483647; // целочисленнное значение, от -2,147,483,648 до 2,147,483,647
        System.out.println("a=" + (a+1));
        double d = 1.75; // числа с дробной частью

        // Дополнительные
        long l = 100L; // большие целочисленные значения от –9,223,372,036,854,775,808 до 9,223,372,036,854,775,807
        float f = 1.75f; // числа с дробной частью с большей точностью

        // a,b,d,l,f - переменная
        System.out.println("l1=" + l);
        l = l * 2; // Присвой значение переменной l удвоенное значение l
        System.out.println("l2=" + l);
        l = l * 2;
        System.out.println("l3=" + l);

        // Другие типы данных
        String s; // строка
        s = "123";

        System.out.println(s);
    }
}

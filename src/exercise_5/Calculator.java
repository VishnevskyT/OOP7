package exercise_5;

/**
 * Завдання 5
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator. У тілі класу створіть чотири методи для
 * арифметичних дій: (add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен
 * перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення,
 * над якими хоче зробити операцію та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.
 */

public class Calculator {

    public void add(double a, double b) {

        try {
            double c = a + b;
            System.out.println("a + b = " + c);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sub(double a, double b) {
        try {
            double c = a - b;
            System.out.println("a - b = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mul(double a, double b) {
        try {
            double c = a * b;
            System.out.println("a x b = " + c);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void div(double a, double b) {
        try {
            double c = a / b;
            System.out.println("a / b = " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("На нуль ділити неможна!");

        }

    }

}

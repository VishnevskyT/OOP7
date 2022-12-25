package exercise_5;

import java.util.Scanner;

/**
 * Завдання 5
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator. У тілі класу створіть чотири методи для
 * арифметичних дій: (add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен
 * перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення,
 * над якими хоче зробити операцію та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.
 */

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть 1-й операнд: _");
        double a = scanner.nextDouble();
        System.out.print("Введіть 2-й операнд: _");
        double b = scanner.nextDouble();
        System.out.print("Введіть необхідну дію над операндами (+, -, *, %): _");
        char operation = scanner.next().charAt(0);

        Calculator calculator = new Calculator();

        switch (operation) {
            case '+' -> calculator.add(a, b);
            case '-' -> calculator.sub(a, b);
            case '*' -> calculator.mul(a, b);
            case '/' -> calculator.div(a, b);
            default -> System.out.println("Щось пішло не так. Введіть дію над операндами серед +, -, *, /");
        }

    }
}

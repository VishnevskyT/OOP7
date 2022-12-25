package exercise_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * Завдання 2
 * Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
 *   прізвище та ініціали працівника;
 *   назва посади;
 *   рік надходження на роботу.
 * Написати програму, яка виконує такі дії:
 *   введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
 *   якщо значення року введено не у відповідному форматі, видає виняток.
 *   виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 5;

        Worker [] workers = new Worker[size];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        for (int i = 0; i < workers.length; i++) {
            System.out.print("Введіть Прізвище та ініціали " + (i + 1) + "-го " + "працівника: _");
            workers[i].name = scanner.nextLine();
            System.out.print("Введіть посаду працівника " + workers[i].name + ": _");
            workers[i].position = scanner.next();
            System.out.print("Введіть рік надходження на роботу працівника " + workers[i].name + ": _");
            do {
                try {
                    workers[i].year = Integer.parseInt(scanner.next());
                    scanner.nextLine();
                    if (workers[i].year < 999 || workers[i].year > 9999) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.print("Введіть рік у форматі YYYY:");
                }
            } while (workers[i].year <999 || workers[i].year > 9999);
        }

         Arrays.sort(workers, Comparator.comparing(Worker::getName));
        System.out.println("Дані працівника:\n" + Arrays.toString(workers));

        System.out.print("Введіть стаж (кількість років), за яким вивести працівників: ");

        int experience = scanner.nextInt();
        int currentYear = 2022;
        for (Worker temp: workers) {
            if (temp.year <= (currentYear - experience)) {
                System.out.print(temp.name + ", " + temp.position + ", " + temp.year + "\n");
            }
        }
    }

}

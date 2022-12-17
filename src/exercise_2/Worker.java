package exercise_2;

import java.util.Objects;

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

public class Worker {
    String name;
    String position;
    int year;

    public Worker() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +", посада = " + position + ", рік надходження на роботу = " + year + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return year == worker.year && Objects.equals(name, worker.name) && Objects.equals(position, worker.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, year);
    }
}

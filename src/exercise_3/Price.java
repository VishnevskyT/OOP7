package exercise_3;

import java.util.Objects;

/**
 * Завдання 3
 * Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
 *   назву товару;
 *   назву магазину, в якому продається товар;
 *   вартість товару у гривнях.
 *  Написати програму, яка виконує такі дії:
 *   введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані
 *  в алфавітному порядку за назвами магазинів);
 *   виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого
 *  магазину немає, вивести виняток).
 */

public class Price {
    String name;
    String shop;
    double price;

    public Price() {
    }

    public Price(String name, String shop, double price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                '}';
    }
}

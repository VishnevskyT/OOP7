package exercise_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
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
public class Main {
    public static void main(String[] args) {
        Price [] item = new Price[2];
        item[0] = new Price();
        item[1] = new Price();

        Scanner scanner = new Scanner(System.in);

        for (Price price : item) {
            System.out.print("Введіть назву товару: _");
            price.name = scanner.next();
            System.out.print("Введіть назву магазину: _");
            price.shop = scanner.next();
            System.out.print("Введіть вартість товару у гривнях: _");
            price.price = scanner.nextDouble();
        }

        Arrays.sort(item, Comparator.comparing(Price::getName));

        for (Price temp : item) {
            System.out.println(temp.name + " "  + temp.shop + " " + temp.price);
        }

        System.out.print("Пошук товарів за назвою магазинів (введіть назву магазину): _");

        String shopFinder = scanner.next();

        for (Price temp : item) {
            try {
                if (temp.shop.equals(shopFinder)) {
                    System.out.println("У магазині " + shopFinder + " наявні наступні товари:\n" + temp.name + " " + temp.price);
                }
                else {
                    throw new NoMatchException("");
                }
            } catch (NoMatchException e) {
                System.out.println("Такого магазину не існує");
            }
        }

//        boolean success = false;
//        while (!success) {
//            try {
//                String shopFinder = scanner.next();
//                for (Price temp : item) {
//                    success = shopFinder.equals(temp.shop);
//                    if (success)
//                        System.out.println(temp);
//                }
//                throw new NoMatchException("!!!!");
//            }
//            catch (Exception e) {
//                scanner.next ();
//            }
//        }

//        try {
//            for (Price temp : item) {
//                if (temp.shop.equals(shopFinder))
//                    System.out.println(temp);
//            }
////            throw new NoMatchException("");
//        } catch (Exception e) {
//            System.out.println("Такого магазину не існує!" + e.getMessage());
//        }


    }
}

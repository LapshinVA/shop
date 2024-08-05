

import Entity.Product;
import Service.*;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>(); // SOLID : D - принцип инверсии зависимости
    static ProductService productService = new ProductServiceImpl(); // SOLID : D - принцип инверсии зависимости
    static BasketService basketService = new BasketServiceImpl(); // SOLID : D - принцип инверсии зависимости
    static Service service = new ServiceImpl(); // SOLID : D - принцип инверсии зависимости

    static Map<Product, Integer> basket = new HashMap<>(); // SOLID : D - принцип инверсии зависимости

    static {
        Product product1 = new Product("молоко", 70.00, "веселый молочник");
        Product product2 = new Product("хлеб", 90.00, "хлебзавод");
        Product product3 = new Product("сок", 130.00, "сады придонья");
        Product product4 = new Product("сыр", 130.00, "сыроварня");
        Product product5 = new Product("говядина", 430.00, "мясокомбинат");
        Product product6 = new Product("сыр", 230.00, "веселый молочник");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш магазин!");

        String str;
        do {
            System.out.println("\nВыберите пункт меню или введите 'exit' для выхода");
            System.out.println(
                            "1. Показать товары доступные для покупки\n" +
                            "2. Отследить заказ в системе доставки\n" +
                            "3. возврат заказа\n" +
                            "4. повторение заказа\n" +
                            "5. показать товары в корзине" +
                            "6. сделать заказ"
            );
            str = sc.nextLine();
            switch (str) {
                case "1":
                    System.out.println("Все доступные для покупки товары:");
                    productService.printProducts(products);
                    System.out.println("Введите номер товара и его количество через пробел или введите 'exit' для выхода");
                    String str2 = sc.nextLine();
                    int [] array = service.parsingFromConsole(str2);
                    basket = basketService.addToBasket(array, basket, products);
                    System.out.println("Товар добавлен в корзину");
                    int count = Collections.frequency(basket.values(), 1);
                    System.out.println(basket);
                    break;
                case "2":
                    // TODO:
                    break;
                case "3":
                    // TODO: 04.08.2024 возврат заказа, повторение заказа
                    break;
                case "4":
                    // TODO: 04.08.2024 отследить заказ в системе доставки
                    break;
                case "5":
                    break;
                case "6":
                    if (basket.size()>0){
                        System.out.println("Для оформления заказа необходимо ввести данные:");
                        System.out.println("Введите Ваше имя");
                        String nameClient = sc.nextLine();
                        System.out.println("Введите Ваше адрес");
                        String addressOfClient = sc.nextLine();
                    }
                    break;
            }
        } while (!str.equals("exit"));

    }
}

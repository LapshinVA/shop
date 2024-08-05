package Service;

import Entity.Product;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLID :
 * - S - принцип единственной ответственности (класс отвечает только за работу с товаром)
 * - О - принцип открытости закрытости (класс открыт для расширения - наследование, имплементация,
 * но закрыт для изменения исходного кода)
 * - D - принцип инверсии зависимости
 */
public class ProductServiceImpl implements ProductService{

    /**
     * Печатает список доступных для покупки товаров
     * @param products - список продкутов
     */
    @Override
    public void printProducts(List <Product> products) {
        int count = 1;
        for (Product product : products) {
            System.out.printf("%s. %s от производителя \"%s\" по цене %g руб.\n",
                    count, product.getName(), product.getManufacturer(), product.getPrice());
            count++;
        }
    }

    /**
     * Фильтрует список продуктов по заданному ключевому слову
     *
     * @param products - список продкутов
     * @param keyWord  - ключевое слово
     * @return отфитрованный список
     */
    @Override
    public List<Product> filterByKeyWord(List<Product> products, String keyWord) {
        List<Product>list = products.stream()
                .filter(a->a.getName().contains(keyWord))
                .collect(Collectors.toList());
        return list;
    }

    public List<Product> filterByManufacture(List<Product> products, String manufacture) {
        List<Product>list = products.stream()
                .filter(a->a.getName().equals(manufacture))
                .collect(Collectors.toList());
        return list;
    }

    public List<Product> filterByPrice(List<Product> products, Double priceMin, Double priceMax) {
        List<Product>list = products.stream()
                .filter(a->a.getPrice()>priceMin && a.getPrice()<priceMax)
                .collect(Collectors.toList());
        return list;
    }
}

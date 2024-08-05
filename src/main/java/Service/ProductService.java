package Service;

import Entity.Product;

import java.util.List;

/**
 * SOLID: I - принцип разделения интерфейсов
 */
public interface ProductService {

    /**
     * Печатает список доступных для покупки товаров
     * @param products - список продкутов
     */
    void printProducts(List<Product> products);

    /**
     * Фильтрует список продуктов по заданному ключевому слову
     * @param products - список продкутов
     * @param keyWord - ключевое слово
     * @return отфитрованный список
     */
    List<Product> filterByKeyWord(List<Product>products, String keyWord);

}

package Service;

import Entity.Product;

import java.util.List;
import java.util.Map;

public class BasketServiceImpl implements BasketService {


    /**
     * Добавляет в корзину товар
     *
     * @param array  - массив введенных данных от клиента (array[0] - номер товара по меню, array[1] - количество товара)
     * @param basket - корзина, по состоянию на некущий момент
     * @param list   - Список товаров из которого товары будут добавляться в корзину
     * @return корзина заполненная добавляемым товаром
     */
    public Map<Product, Integer> addToBasket(int[] array, Map<Product, Integer> basket, List<Product> list) {
        int productNumber = array[0];
        int productCount = array[1];
        Product product = list.get(productNumber - 1);
        if (basket.containsKey(product)) {
            Integer integer = basket.get(product);
            basket.put(product, integer + productCount);
        } else {
            basket.put(product, productCount);
        }
        return basket;
    }


    /**
     * Удаляет товар из корзины
     *
     * @param array
     * @param basket
     * @param list
     * @return
     */
    @Override
    public Map<Product, Integer> removeFromBasket(int[] array, Map<Product, Integer> basket, List<Product> list) {
        return null;
    }

    /**
     * Возвращает количетство товаров в корзине
     *
     * @param basket
     * @return
     */
    @Override
    public int countProductInBasket(Map<Product, Integer> basket) {
        return 0;
    }

    /**
     * Печать товаров в корзине
     *
     * @param basket корзина
     */
    @Override
    public void printProductFromBasket(Map<Product, Integer> basket) {

    }
}

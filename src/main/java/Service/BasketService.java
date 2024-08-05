package Service;

import Entity.Product;

import java.util.List;
import java.util.Map;

public interface BasketService {


    /**
     * Добавляет в корзину товар и его количество
     *
     * @param array  - массив введенных данных от клиента (array[0] - номер товара по меню, array[1] - количество товара)
     * @param basket - корзина, по состоянию на некущий момент
     * @param list   - Список товаров из которого товары будут добавляться в корзину
     * @return корзина заполненная добавляемым товаром
     */
    Map<Product, Integer> addToBasket(int[] array, Map<Product, Integer> basket, List<Product> list);


    /**
     * Удаляет товар из корзины
     * @param array
     * @param basket
     * @param list
     * @return
     */
    Map<Product, Integer> removeFromBasket(int[] array, Map<Product, Integer> basket, List<Product> list);


    /**
     * Возвращает количетство товаров в корзине
     * @param basket
     * @return
     */
    int countProductInBasket(Map<Product, Integer> basket);


    /**
     * Печать товаров в корзине
     * @param basket корзина
     */
    void printProductFromBasket (Map<Product, Integer> basket);
}

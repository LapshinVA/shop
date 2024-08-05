package Service;

import Entity.Product;

import java.util.Map;

public interface OrderService {

    void createOrder(Map<Product, Integer> basket);
}

package Entity;

import java.util.Objects;

public class Product {
    private static int idProdict;
    private String name;
    private Double price;
    private final String manufacturer;

    private int quantity;

    public Product(String name, Double price, String manufacturer) {
        this.idProdict++;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;

    }

    public static int getIdProduct() {
        return idProdict;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, manufacturer, quantity);
    }
}

package ru.gb.spring_boot.repository;

import org.springframework.stereotype.Component;
import ru.gb.spring_boot.dto.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Прод1", 10));
        productList.add(new Product(2, "Прод2", 20));
        productList.add(new Product(3, "Прод3", 30));
    }

    public List<Product> getAll() {
        return List.copyOf(productList);
    }

    public void save(Product product) {
        productList.add(product);
    }

    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) return product;
        }
        return null;
    }
}

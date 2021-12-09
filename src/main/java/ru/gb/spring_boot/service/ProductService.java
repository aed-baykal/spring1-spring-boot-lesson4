package ru.gb.spring_boot.service;

import org.springframework.stereotype.Service;
import ru.gb.spring_boot.dto.Product;
import ru.gb.spring_boot.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public Product findById(int id) {
        return productRepository.findById(id);
    }
}

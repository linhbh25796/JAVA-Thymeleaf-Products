package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    public static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Mobile","Iphone",100,1000));
        products.put(2,new Product(2,"Car","Lamborghini",1,100000));
        products.put(3,new Product(3,"Dress","T-shirt",500,100));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
            products.remove(id);
    }
}

package jsl.group.spring_shell.service;

import jsl.group.spring_shell.model.Product;

import java.util.Locale;

public interface ProductService {
    void saveProduct(Product product, Locale locale);
}

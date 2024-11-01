package jsl.group.spring_shell.repository;

import jsl.group.spring_shell.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

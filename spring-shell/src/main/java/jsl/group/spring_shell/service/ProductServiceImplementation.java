package jsl.group.spring_shell.service;

import jsl.group.spring_shell.events.NewProductEvent;
import jsl.group.spring_shell.model.Product;
import jsl.group.spring_shell.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class ProductServiceImplementation implements ProductService{
    private final ProductRepository productRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void saveProduct(Product product, Locale locale) {
        Product savedProduct = productRepository.save(product);
        applicationEventPublisher.publishEvent(new NewProductEvent(savedProduct.getProductName(), OffsetDateTime.now(), locale));
    }
}

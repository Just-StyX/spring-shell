package jsl.group.spring_shell.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductEventListener {
    @EventListener
    public void onNewProduct(NewProductEvent newProductEvent) {
        var message = """
                New Product Added
                ------
                
                Product Name: {}
                Time Added: {}
                ------
                """;
        System.out.printf(String.format(message, newProductEvent.productName(), newProductEvent.offsetDateTime()));
    }
}

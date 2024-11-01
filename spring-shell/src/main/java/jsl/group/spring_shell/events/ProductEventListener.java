package jsl.group.spring_shell.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductEventListener {
    @EventListener
    public void onNewProduct(NewProductEvent newProductEvent) {
        System.out.printf(String.format("New Product Added\n------ \n\nProduct Name: %s \nTime Added: %s \n------\n", newProductEvent.getProductName(), newProductEvent.getOffsetDateTime()));
    }
}

package jsl.group.spring_shell.events;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductEventListener {
    private final MessageSource messageSource;

    @EventListener
    public void onNewProduct(NewProductEvent newProductEvent) {
        var message = messageSource.getMessage(
                "shell.product-added",
                new String[]{newProductEvent.getProductName(), newProductEvent.getOffsetDateTime().toString()},
                newProductEvent.getLocale());

        log.info("{}\n", message);
    }
}

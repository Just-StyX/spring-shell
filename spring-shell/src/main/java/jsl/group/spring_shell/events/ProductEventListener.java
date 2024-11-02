package jsl.group.spring_shell.events;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    private final ObjectMapper objectMapper;

    @EventListener
    public void onNewProduct(NewProductEvent newProductEvent) throws JsonProcessingException {
        var message = messageSource.getMessage(
                "shell.product-added",
                new String[]{newProductEvent.getProductName(), newProductEvent.getOffsetDateTime().toString()},
                newProductEvent.getLocale());

        log.info("{}\n", message);
        System.out.println(objectMapper.writeValueAsString(
                new CustomMessage(message, newProductEvent)
        ));
    }
}

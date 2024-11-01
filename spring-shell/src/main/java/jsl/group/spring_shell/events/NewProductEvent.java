package jsl.group.spring_shell.events;

import java.time.OffsetDateTime;

public record NewProductEvent(
        String productName, OffsetDateTime offsetDateTime
) {
}

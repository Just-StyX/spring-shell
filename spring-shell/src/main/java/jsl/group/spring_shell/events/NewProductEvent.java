package jsl.group.spring_shell.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewProductEvent {
    String productName;
    OffsetDateTime offsetDateTime;
    Locale locale;
}

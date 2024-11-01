package jsl.group.spring_shell.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class StringToBigDecimal implements Converter<String, BigDecimal> {
    @Override
    public BigDecimal convert(@NonNull String source) {
        return new BigDecimal(source);
    }
}

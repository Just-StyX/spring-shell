package jsl.group.spring_shell.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JsonMapperConfig {
    @Bean
    public ObjectMapper customJson(Jackson2ObjectMapperBuilder builder) {
        return builder.indentOutput(true)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .build();
    }
}

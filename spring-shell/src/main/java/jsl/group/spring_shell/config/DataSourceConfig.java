package jsl.group.spring_shell.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Value("${app.datasource.url}")
    private String url;
    @Value("${app.datasource.password}")
    private String password;
    @Value("${app.datasource.username}")
    private String username;

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .username(username)
                .password(password)
                .url(url)
                .build();
    }
}

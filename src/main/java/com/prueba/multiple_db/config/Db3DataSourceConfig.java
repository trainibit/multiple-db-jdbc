package com.prueba.multiple_db.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Db3DataSourceConfig {

    @Value("${spring.datasource.db3.driver-class-name}")
    private String driver;

    @Value("${spring.datasource.db3.url}")
    private String url;

    @Value("${spring.datasource.db3.username}")
    private String username;

    @Value("${spring.datasource.db3.password}")
    private String password;

    @Bean(name = "db3DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db3")
    public DataSource db3DataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "db3JdbcTemplate")
    public JdbcTemplate db1JdbcTemplate(@Qualifier("db3DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
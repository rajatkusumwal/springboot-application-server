package com.dbs.bootcamp.audit.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("default")
public class DataSourceDefaultConfiguration {

    @Value("${spring.datasource.url:jdbc:h2:~/auditlog;DB_CLOSE_ON_EXIT=false}")
    private String datasourceurl;

    @Value("${spring.datasource.username:sa}")
    private String datasourceuser;

    @Value("${spring.datasource.password:}")
    private String datasourcepassword;

    @Value("${message:Hello default}")
    private String message;


    @Bean
    @Primary
    public DataSource dataSource() {
            System.out.println("Hello test messgae"+message);
            return DataSourceBuilder
                    .create()
                    .username(datasourceuser)
                    .password(datasourcepassword)
                    .url(datasourceurl)
                    .build();
    }
}

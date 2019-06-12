package com.gmm.drp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication/*(exclude = {DataSourceAutoConfiguration.class})*/
@MapperScan("com.gmm.drp.dao")
public class DrpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrpApplication.class, args);
    }


}

package com.diebu.right;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author tangjunliang
 */
@EnableAsync
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.diebu.right.*.mapper")
public class DiebuRightApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DiebuRightApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
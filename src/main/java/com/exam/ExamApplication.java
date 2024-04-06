package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ziyuan
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ExamApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ExamApplication.class, args);
    }
}

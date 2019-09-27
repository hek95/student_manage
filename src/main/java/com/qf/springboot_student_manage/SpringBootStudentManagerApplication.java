package com.qf.springboot_student_manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringBootStudentManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudentManagerApplication.class,args);
    }
}

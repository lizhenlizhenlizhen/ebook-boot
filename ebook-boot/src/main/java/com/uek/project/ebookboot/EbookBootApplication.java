package com.uek.project.ebookboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.uek.project.ebookboot.mapper","com.uek.project.ebookboot.dao"})
public class EbookBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookBootApplication.class, args);
	}

}

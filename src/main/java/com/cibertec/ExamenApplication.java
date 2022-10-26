package com.cibertec;

import com.cibertec.controller.ViajeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {
		"com.cibertec.controller",
		"com.cibertec.dao",
		"com.cibertec.entity",
		"com.cibertec.impl",
		"com.cibertec.service",

})
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}

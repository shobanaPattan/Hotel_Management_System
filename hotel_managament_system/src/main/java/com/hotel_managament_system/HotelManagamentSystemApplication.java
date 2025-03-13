package com.hotel_managament_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HotelManagamentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagamentSystemApplication.class, args);
	}

}

package ua.lviv.iot.algo.part1.lab6.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.algo.part1.lab6.controler",
		"ua.lviv.iot.algo.part1.lab6.service"})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}

package it.dav.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		log.info("VERSION {}", 2);
		SpringApplication.run(DemoApplication.class, args);
	}

}

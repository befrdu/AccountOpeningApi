package citi.fintech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("citi.fintech")
public class AccountOpeningApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountOpeningApiApplication.class, args);
	}
}

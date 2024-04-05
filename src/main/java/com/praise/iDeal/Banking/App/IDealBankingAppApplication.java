package com.praise.iDeal.Banking.App;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "iDeal Banking Wallet",
				description = "Backend REST APIs for World Banking Application",
				version = "v.1.0",
				contact = @Contact(
						name = "Praise Abu",
						email = "praiseabu2000@gmail.com",
						url = "https://itohanosa.vercel.app"
				),
				license = @License(
						name = "iDeal Banking Wallet",
						url = "https://itohanosa.vercel.app"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Backend REST APIs for World Banking Application",
				url = "https://itohanosa.vercel.app"
		)
)
public class IDealBankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IDealBankingAppApplication.class, args);
	}

}

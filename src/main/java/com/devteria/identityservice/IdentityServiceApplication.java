package com.devteria.identityservice;

import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.crypto.SecretKey;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class IdentityServiceApplication {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();

		SpringApplication.run(IdentityServiceApplication.class, args);
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("  ---------------APPLICATION STARTED 8088---------------");
		System.out.println("   ---------- "+date+" ----------");
		System.out.println();

	}


}

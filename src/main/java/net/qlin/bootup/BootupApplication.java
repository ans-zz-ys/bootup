package net.qlin.bootup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootUpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootupApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("BootUp is boot up...");
	}
}

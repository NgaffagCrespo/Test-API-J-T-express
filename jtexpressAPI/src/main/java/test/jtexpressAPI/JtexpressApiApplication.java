package test.jtexpressAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JtexpressApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtexpressApiApplication.class, args);
	}

}

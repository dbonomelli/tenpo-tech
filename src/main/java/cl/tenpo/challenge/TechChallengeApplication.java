package cl.tenpo.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableRetry
@EnableAsync
public class TechChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechChallengeApplication.class, args);
	}

}

package io.mosip.biosdktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.vishag.async.AsyncContext;

/**
 * @author Manoj SP
 *
 */
@SpringBootApplication
public class BioTestBootApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(BioTestBootApplication.class, args);
		SpringApplication.exit(context);
	}
}

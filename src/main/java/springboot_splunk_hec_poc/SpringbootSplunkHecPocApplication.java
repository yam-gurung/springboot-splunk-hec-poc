package springboot_splunk_hec_poc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSplunkHecPocApplication implements CommandLineRunner {

	
	private static final Logger logger=LogManager.getLogger(SpringbootSplunkHecPocApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSplunkHecPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("called");
		logger.info("this is information message send from app to splunk server");
       // logger.error("This is an error message with potential stack trace", new RuntimeException("Test exception"));

	}
	

}

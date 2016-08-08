package co.uk.kbk.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {

		log.info("Program Arguments:");

		log.info("Production " + System.getProperty("api"));
		log.info("Movie " + System.getProperty("movie"));

		String title = System.getProperty("movie");

		RestTemplate restTemplate = new RestTemplate();
		Movie[] movies = restTemplate.getForObject("http://localhost:8080/movies/fetch/"+title, Movie[].class);
		
		System.out.println("############# "+movies.length+" Movies Found ############");
		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i].toString());
		}
	}

}
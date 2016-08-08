package co.uk.kbk.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.uk.kbk.backend.entity.Movie;
import co.uk.kbk.backend.repository.MediaRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(MediaRepository repository) {
		return (args) -> {

			// save a couple of movies
			repository.save(new Movie("Indiana Jones and the Last Crusade", "1989", "PG-13", "24 May 1989", "127 mins",
					"Action, Adventure, Fantasy", "Steven Spielberg",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Indiana Jones and the Kingdom of the Crystal Skull", "1989", "PG-13",
					"24 May 1989", "127 mins", "Action, Adventure, Fantasy", "Steven Spielberg",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Indiana Jones and the Temple of Doom", "1989", "PG-13", "24 May 1989",
					"127 mins", "Action, Adventure, Fantasy", "Steven Spielberg",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Underworld", "2003", "PG-13", "24 May 1989", "127 mins",
					"Action, Adventure, Fantasy", "Len Wiseman",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Underworld: Evolution", "2006", "PG-13", "24 May 1989", "127 mins",
					"Action, Adventure, Fantasy", "Len Wiseman",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Underworld: Rise of the Lycans", "2009", "PG-13", "24 May 1989", "127 mins",
					"Action, Adventure, Fantasy", "Patrick Tatopoulos",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Underworld: Awakening", "2012", "PG-13", "24 May 1989", "127 mins",
					"Action, Adventure, Fantasy", "Måns Mårlind, Björn Stein",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			repository.save(new Movie("Underworld: Blood Wars", "2017", "PG-13", "24 May 1989", "127 mins",
					"Action, Adventure, Fantasy", "Anna Foerster",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Harrison Ford, Sean Connery, Denholm Elliott, Alison Doody",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			
			repository.save(new Movie("Blade", "1998", "PG-13", "24 May 1998", "227 mins",
					"Action, Adventure, Fantasy", "Stephen Norrington",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Peter Frankfurt, Wesley Snipes, Robert Engelman, Andrew J. Horne, Avi Arad",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			
			repository.save(new Movie("Blade II", "2002", "PG-13", "24 May 2002", "127 mins",
					"Action, Adventure, Fantasy", "Guillermo del Toro",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Peter Frankfurt, Wesley Snipes, Patrick Palmer",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));
			
			repository.save(new Movie("Blade Trinity", "2004", "PG-13", "24 May 2004", "127 mins",
					"Action, Adventure", "David S. Goyer",
					"Jeffrey Boam (screenplay), George Lucas (story), Menno Meyjes (story), George Lucas (characters), Philip Kaufman (characters)",
					"Peter Frankfurt, Wesley Snipes, David S. Goyer, Lynn Harris",
					"When Dr. Henry Jones Sr. suddenly goes missing while pursuing the Holy Grail, eminent archaeologist Indiana Jones must follow in his father's footsteps and stop the Nazis.",
					"English, German, Greek", "USA", "Won 1 Oscar. Another 5 wins & 20 nominations.",
					"http://ia.media-imdb.com/images/M/MV5BMTQxMTUyODg2OF5BMl5BanBnXkFtZTcwNDM2MjAxNA@@._V1_SX300.jpg",
					"8.3", "510,696", "tt0097576", "movie"));

			// fetch all movies
			log.info("Movie found with findAll():");
			log.info("-------------------------------");
			for (Movie customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual movie by ID
			Movie customer = repository.findOne(1L);
			log.info("Movie found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch movies by title Underworld
			log.info("Movie found by findByTitle('Indiana Jones'):");
			log.info("--------------------------------------------");
			for (Movie iJones : repository.findByTitleContaining("Indiana Jones")) {
				log.info(iJones.toString());
			}

			// fetch movies by title Underworld
			log.info("Movie found by findByTitle('Underworld'):");
			log.info("--------------------------------------------");
			for (Movie underworld : repository.findByTitleContaining("Underworld")) {
				log.info(underworld.toString());
			}
			log.info("");
		};
	}

}

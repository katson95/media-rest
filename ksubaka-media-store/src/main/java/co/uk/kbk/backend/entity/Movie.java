package co.uk.kbk.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String title;
    private String year;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;
    private String metascore;
    private String imdbRating;
    private String imdbVotes;
    private String type;
    private String response;

    protected Movie() {}

    

    public Movie(String title, String year, String rated, String released, String runtime, String genre,
			String director, String writer, String actors, String plot, String language, String country, String awards,
			String poster, String metascore, String imdbRating, String imdbVotes, String type) {
		super();
		this.title = title;
		this.year = year;
		this.rated = rated;
		this.runtime = runtime;
		this.genre = genre;
		this.director = director;

		this.actors = actors;
		this.plot = plot;
		this.language = language;
		this.country = country;
		this.awards = awards;
		this.poster = poster;
		this.metascore = metascore;
		this.imdbRating = imdbRating;
		this.imdbVotes = imdbVotes;
		this.type = type;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getRated() {
		return rated;
	}



	public void setRated(String rated) {
		this.rated = rated;
	}



	public String getReleased() {
		return released;
	}



	public void setReleased(String released) {
		this.released = released;
	}



	public String getRuntime() {
		return runtime;
	}



	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getActors() {
		return actors;
	}



	public void setActors(String actors) {
		this.actors = actors;
	}



	public String getPlot() {
		return plot;
	}



	public void setPlot(String plot) {
		this.plot = plot;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getAwards() {
		return awards;
	}



	public void setAwards(String awards) {
		this.awards = awards;
	}



	public String getPoster() {
		return poster;
	}



	public void setPoster(String poster) {
		this.poster = poster;
	}



	public String getMetascore() {
		return metascore;
	}



	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}



	public String getImdbRating() {
		return imdbRating;
	}



	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}



	public String getImdbVotes() {
		return imdbVotes;
	}



	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", rated=" + rated + ", released=" + released
				+ ", runtime=" + runtime + ", genre=" + genre + ", director=" + director + ", writer=" + writer
				+ ", actors=" + actors + ", plot=" + plot + ", language=" + language + ", country=" + country
				+ ", awards=" + awards + ", poster=" + poster + ", metascore=" + metascore + ", imdbRating="
				+ imdbRating + ", imdbVotes=" + imdbVotes + ", type=" + type + ", response=" + response + "]";
	}

}


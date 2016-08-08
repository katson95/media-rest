package co.uk.kbk.backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.uk.kbk.backend.entity.Movie;
import co.uk.kbk.backend.service.IMediaService;

/*
 * Restful Endpoint for managing movies.
 */
@RestController
@RequestMapping(value = "/movies")
public class MediaController {

	@Autowired
	private IMediaService mediaService;
/**
 * Fetches movie from the database.
 * @param title
 * @return List of found movies
 */
	@RequestMapping(value = "/fetch/{title}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Movie>> findMovieByTitle(@Valid @PathVariable("title") String title) {
		List<Movie> movies = mediaService.findMovieByTitle(title);
		return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
	}
}

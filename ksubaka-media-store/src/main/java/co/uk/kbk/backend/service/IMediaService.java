package co.uk.kbk.backend.service;

import java.util.List;

import co.uk.kbk.backend.entity.Movie;

/*
 * Provides operations for accessing media data.
 */
public interface IMediaService {
	
	/*
	 * Fetches movie containing a specific title
	 */
	public List<Movie> findMovieByTitle(String title);
}

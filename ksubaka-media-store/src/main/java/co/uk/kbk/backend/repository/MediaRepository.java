package co.uk.kbk.backend.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.uk.kbk.backend.entity.Movie;

/*
 * Repository for managing movies.
 */
@Transactional
public interface MediaRepository extends JpaRepository<Movie, Long> {

	/*
	 * Fetches movie containing a specific title
	 */
    List<Movie> findByTitleContaining(String title);

}

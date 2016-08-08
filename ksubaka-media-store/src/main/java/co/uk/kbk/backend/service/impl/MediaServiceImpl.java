package co.uk.kbk.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.uk.kbk.backend.entity.Movie;
import co.uk.kbk.backend.repository.MediaRepository;
import co.uk.kbk.backend.service.IMediaService;

@Service
public class MediaServiceImpl implements IMediaService {

	@Autowired
	MediaRepository mediaRepository;

	@Override
	public List<Movie> findMovieByTitle(String title) {
		return mediaRepository.findByTitleContaining(title);
	}

}

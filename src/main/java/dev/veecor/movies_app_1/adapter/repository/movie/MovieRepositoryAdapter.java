package dev.veecor.movies_app_1.adapter.repository.movie;

import dev.veecor.movies_app_1.app.api.movie.MovieRepository;
import dev.veecor.movies_app_1.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MovieRepositoryAdapter implements MovieRepository {
    private final MovieMongoRepository movieMongoRepository;

    @Override
    public List<Movie> findAll() {
        return movieMongoRepository.findAll();
    }

    public Optional<Movie> findByImdbId(String imdbId) {
        return movieMongoRepository.findByImdbId(imdbId);
    }
}

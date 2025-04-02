package dev.veecor.movies_app_1.app.api.movie;

import dev.veecor.movies_app_1.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {
    List<Movie> findAll();

    Optional<Movie> findByImdbId(String imdbId);
}

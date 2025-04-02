package dev.veecor.movies_app_1.app.api.movie;

import dev.veecor.movies_app_1.domain.Movie;

import java.util.Optional;

public interface GetMovieByImdbIdInbound {
    Optional<Movie> execute(String imdbId);
}

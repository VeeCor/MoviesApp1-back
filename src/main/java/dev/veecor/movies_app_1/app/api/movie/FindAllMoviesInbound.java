package dev.veecor.movies_app_1.app.api.movie;

import dev.veecor.movies_app_1.domain.Movie;

import java.util.List;

public interface FindAllMoviesInbound {
    List<Movie> execute();
}

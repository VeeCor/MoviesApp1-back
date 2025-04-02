package dev.veecor.movies_app_1.adapter.rest.movie;

import dev.veecor.movies_app_1.app.api.movie.FindAllMoviesInbound;
import dev.veecor.movies_app_1.app.api.movie.GetMovieByImdbIdInbound;
import dev.veecor.movies_app_1.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final FindAllMoviesInbound findAllMoviesInbound;
    private final GetMovieByImdbIdInbound getMovieByIdInbound;

    @GetMapping()
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(findAllMoviesInbound.execute());
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String imdbId) {
        return ResponseEntity.ok(getMovieByIdInbound.execute(imdbId));
    }
}

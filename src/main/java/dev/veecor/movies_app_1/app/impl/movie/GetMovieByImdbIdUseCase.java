package dev.veecor.movies_app_1.app.impl.movie;

import dev.veecor.movies_app_1.app.api.movie.GetMovieByImdbIdInbound;
import dev.veecor.movies_app_1.app.api.movie.MovieRepository;
import dev.veecor.movies_app_1.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetMovieByImdbIdUseCase implements GetMovieByImdbIdInbound {
    private final MovieRepository movieRepository;

    @Transactional(readOnly = true)
    @Override
    public Optional<Movie> execute(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}

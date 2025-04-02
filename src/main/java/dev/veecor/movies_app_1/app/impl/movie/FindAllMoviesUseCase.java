package dev.veecor.movies_app_1.app.impl.movie;

import dev.veecor.movies_app_1.app.api.movie.FindAllMoviesInbound;
import dev.veecor.movies_app_1.app.api.movie.MovieRepository;
import dev.veecor.movies_app_1.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllMoviesUseCase implements FindAllMoviesInbound {
    private final MovieRepository movieRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Movie> execute() {
        return movieRepository.findAll();
    }
}

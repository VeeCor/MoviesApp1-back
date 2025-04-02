package dev.veecor.movies_app_1.adapter.repository.review;

import dev.veecor.movies_app_1.app.api.review.ReviewRepository;
import dev.veecor.movies_app_1.domain.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryAdapter implements ReviewRepository {
    private final ReviewMongoRepository reviewMongoRepository;

    @Override
    public List<Review> findAll() {
        return reviewMongoRepository.findAll();
    }

    @Override
    public Review insert(Review review) {
        return reviewMongoRepository.insert(review);
    }
}

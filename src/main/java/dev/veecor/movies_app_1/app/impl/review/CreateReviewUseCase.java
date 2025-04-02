package dev.veecor.movies_app_1.app.impl.review;

import dev.veecor.movies_app_1.app.api.review.CreateReviewInbound;
import dev.veecor.movies_app_1.app.api.review.ReviewRepository;
import dev.veecor.movies_app_1.domain.Movie;
import dev.veecor.movies_app_1.domain.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateReviewUseCase implements CreateReviewInbound {
    private final ReviewRepository reviewRepository;
    private final MongoTemplate mongoTemplate;

    @Override
    public Review execute(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
            .matching(Criteria.where("imdbId").is(imdbId))
            .apply(new Update().push("reviewIds").value(review))
            .first();
        return review;
    }
}

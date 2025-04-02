package dev.veecor.movies_app_1.app.api.review;

import dev.veecor.movies_app_1.domain.Review;

import java.util.List;

public interface ReviewRepository {
    List<Review> findAll();

    Review insert(Review review);
}
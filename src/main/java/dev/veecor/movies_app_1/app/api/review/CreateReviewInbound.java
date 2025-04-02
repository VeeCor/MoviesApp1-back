package dev.veecor.movies_app_1.app.api.review;

import dev.veecor.movies_app_1.domain.Review;

public interface CreateReviewInbound {
    Review execute(String reviewBody, String imdbId);
}

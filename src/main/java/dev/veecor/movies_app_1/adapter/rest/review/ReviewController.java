package dev.veecor.movies_app_1.adapter.rest.review;

import dev.veecor.movies_app_1.app.api.review.CreateReviewInbound;
import dev.veecor.movies_app_1.domain.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest-api/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final CreateReviewInbound createReviewInbound;

    @PostMapping
    private ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<>(createReviewInbound.execute(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}

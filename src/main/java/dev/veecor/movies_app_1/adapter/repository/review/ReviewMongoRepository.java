package dev.veecor.movies_app_1.adapter.repository.review;

import dev.veecor.movies_app_1.domain.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewMongoRepository extends MongoRepository<Review, ObjectId> {
}

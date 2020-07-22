package com.chkpt4training.training.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired ReviewService reviewService;

    @GetMapping()
    public List<Review> getReviews() {
        return reviewService.getReviews();
    }

    @PostMapping()
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping("/{id}")
    public Review updateReview(@RequestBody Review review) {
        return reviewService.updateReview(review);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReview(@PathVariable Long id) {
            reviewService.deleteReview(id);
    }
}

package com.example.demo.Controllers;

import com.example.demo.Domain.Entity.Review;
import com.example.demo.IReview;
import com.example.demo.Service.Interface.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController implements IReview {
    @Autowired
    private final IReviewService iReviewService;

    public ReviewController(IReviewService iReviewService) {
        this.iReviewService = iReviewService;
    }

    @CrossOrigin
    @GetMapping("/review")
    public List<Review> findAllReview() {
        return iReviewService.findAllReview();
    }

    @CrossOrigin
    @PostMapping("/create-review")
    public void createReview(@RequestBody Review review) {
        System.out.println(review.toString());
        iReviewService.create(review);
    }
}

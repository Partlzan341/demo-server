package com.example.demo.Service.Interface;

import com.example.demo.Domain.Entity.Review;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IReviewService {
    List<Review> findAllReview();

    void create(@RequestBody Review review);
}

package com.example.demo.Service.Impl;

import com.example.demo.Domain.Entity.Review;
import com.example.demo.Repository.ReviewRepository;
import com.example.demo.Service.Interface.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements IReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public List<Review> findAllReview() {
        return reviewRepository.findAll();
    }

    @Override
    public void create(Review review) {
        reviewRepository.save(review);
    }
}

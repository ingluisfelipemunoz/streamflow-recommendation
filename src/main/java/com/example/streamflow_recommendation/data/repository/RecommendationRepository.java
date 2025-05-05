package com.example.streamflow_recommendation.data.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.example.streamflow_recommendation.data.entity.Recommendation;
import com.example.streamflow_recommendation.data.entity.Recommendation.RecommendationKey;

import reactor.core.publisher.Mono;

public interface RecommendationRepository extends ReactiveCassandraRepository<Recommendation, RecommendationKey> {
    Mono<Recommendation> findByKey_UserId(UUID userId);
}

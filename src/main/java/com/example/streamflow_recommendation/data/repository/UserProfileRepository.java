package com.example.streamflow_recommendation.data.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.example.streamflow_recommendation.data.entity.UserProfile;

import reactor.core.publisher.Mono;

public interface UserProfileRepository extends ReactiveCassandraRepository<UserProfile, UUID> {
    Mono<UserProfile> findByUserId(UUID id);
}

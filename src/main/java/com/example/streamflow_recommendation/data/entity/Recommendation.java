package com.example.streamflow_recommendation.data.entity;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_recommendations")
public class Recommendation {
    @PrimaryKey
    private RecommendationKey key;

    private List<UUID> recommendedContentIds;

    public RecommendationKey getKey() {
        return key;
    }

    public void setKey(RecommendationKey key) {
        this.key = key;
    }

    public List<UUID> getRecommendedContentIds() {
        return recommendedContentIds;
    }

    public void setRecommendedContentIds(List<UUID> recommendedContentIds) {
        this.recommendedContentIds = recommendedContentIds;
    }

    public static class RecommendationKey {
        @PrimaryKeyColumn(name = "user_id", type = PrimaryKeyType.PARTITIONED)
        private UUID userId;

        public UUID getUserId() {
            return userId;
        }

        public void setUserId(UUID userId) {
            this.userId = userId;
        }
    }
}

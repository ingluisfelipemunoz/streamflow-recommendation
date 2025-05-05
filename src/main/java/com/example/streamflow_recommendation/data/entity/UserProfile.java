package com.example.streamflow_recommendation.data.entity;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_profiles")
public class UserProfile {
    @PrimaryKeyColumn(name = "user_id", type = PrimaryKeyType.PARTITIONED)
    private UUID userId;

    private Set<UUID> viewedContent;// visualized content
    private Set<String> preferredGenres;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Set<UUID> getViewedContent() {
        return viewedContent;
    }

    public void setViewedContent(Set<UUID> viewedContent) {
        this.viewedContent = viewedContent;
    }

    public Set<String> getPreferredGenres() {
        return preferredGenres;
    }

    public void setPreferredGenres(Set<String> preferredGenres) {
        this.preferredGenres = preferredGenres;
    }

}

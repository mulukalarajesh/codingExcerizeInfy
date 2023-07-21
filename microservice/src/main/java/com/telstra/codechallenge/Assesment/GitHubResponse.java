package com.telstra.codechallenge.Assesment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class GitHubResponse {
    private List<GitHubRepository> items;

    public List<GitHubRepository> getItems() {
        return items;
    }

    public void setItems(List<GitHubRepository> items) {
        this.items = items;
    }
}


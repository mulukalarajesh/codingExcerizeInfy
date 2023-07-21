package com.telstra.codechallenge.Assesment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GitHubService {


    private static final String GITHUB_API_URL = "https://api.github.com/search/repositories?q=stars:>0&sort=stars&order=desc&per_page=";

    @Autowired
    private RestTemplate restTemplate;

    public List<GitHubRepository> getHottestRepositories(int limit) {
        String apiUrl = GITHUB_API_URL + limit;
        GitHubResponse response = restTemplate.getForObject(apiUrl, GitHubResponse.class);
        return response != null ? response.getItems() : new ArrayList<>();
    }
}

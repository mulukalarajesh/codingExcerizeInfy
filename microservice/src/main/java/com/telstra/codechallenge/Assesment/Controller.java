package com.telstra.codechallenge.Assesment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private GitHubService gitHubService;

    @GetMapping("/hottest-repositories")
    public List<GitHubRepository> getHottestRepositories(@RequestParam(defaultValue = "10") int limit) throws Exception {
        try {
            return gitHubService.getHottestRepositories(limit);
        }catch(Exception e){
            throw new Exception("failed to get the hottest repos");
        }
    }
}

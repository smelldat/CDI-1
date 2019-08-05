package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;
import fr.wildcodeschool.githubtracker.service.GithubUtils;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
@InMemory
public class MemoryGithuberDAO implements GithuberDAO {

    private HashMap<String, Githuber> listGithuber = new HashMap<>();

    @Override
    public List<Githuber> getGithubers() {
        return new ArrayList<>(listGithuber.values());
    }

    @Override
    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException{
        listGithuber.put(githuber.getLogin(),githuber);
    }

    @Inject
    GithubUtils gu;

    @PostConstruct
    private void getAll() {
        try {
            saveGithuber(gu.parseGithuber("Octopussyzz"));
            saveGithuber(gu.parseGithuber("alexandrahilary"));
            saveGithuber(gu.parseGithuber("ClementLecomte"));
            saveGithuber(gu.parseGithuber("athanyl"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}



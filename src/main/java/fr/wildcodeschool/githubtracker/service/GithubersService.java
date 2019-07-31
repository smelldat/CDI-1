package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Stream;

@Dependent
public class GithubersService {
    private GithuberDAO dao;

    @Inject
    public GithubersService(GithuberDAO dao) {
        this.dao = dao;
    }


    public List<Githuber> getAllGithubers(){
        return dao.getGithubers();
    }

    public Githuber getGithuber(String login){
        return (Githuber) getAllGithubers().stream()
                .filter(item -> item.getLogin().equals(login));
    }

    public void track(String login){
        //TODO
    }
}

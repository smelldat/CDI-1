package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.model.Githuber;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.net.MalformedURLException;
import java.util.List;

@Dependent
public class GithubersService {
    @Inject
    GithubUtils githubUtils;

    @Inject
    @InMemory
    private GithuberDAO dao;

    public GithubersService() {

    }

    public List<Githuber> getAllGithubers(){
        return dao.getGithubers();
    }

    public Githuber getGithuber(String login){
        return (Githuber) getAllGithubers().stream()
                .filter(item -> item.getLogin().equals(login));
    }

    public void track(String login) throws MalformedURLException {
          dao.saveGithuber(githubUtils.parseGithuber(login));
    }
}

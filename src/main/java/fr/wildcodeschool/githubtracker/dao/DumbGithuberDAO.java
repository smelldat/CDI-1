package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Dependent
public class DumbGithuberDAO implements GithuberDAO {


    public List getGithubers() {
        Githuber andre = new Githuber("Andre", "dd@gmail.com", "haha", "dd33", "DD/img/bg.jpg");
        Githuber fabien = new Githuber("Fabien", "fabien@gmail.com", "hehe", "fab33", "fab");
        Githuber josephine = new Githuber("Josephine", "josephine@gmail.com", "hihi", "jo33", "josephine");
        Githuber elisa = new Githuber("Elisa", "elisa@gmail.com", "huhu", "elisa33", "elisa");
        Githuber alexandre = new Githuber("Alexandre", "alex@gmail.com", "hoho", "alex33", "ui");

        ArrayList<Githuber> githubersList = new ArrayList<Githuber>();
        githubersList.add(andre);
        githubersList.add(fabien);
        githubersList.add(josephine);
        githubersList.add(elisa);
        githubersList.add(alexandre);

        Collections.unmodifiableList(githubersList);

        return githubersList;
    }

}

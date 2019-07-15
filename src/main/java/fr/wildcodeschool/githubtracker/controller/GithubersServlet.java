package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "GithubersServlet")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Githuber andre = new Githuber("Andre", "dd@gmail.com" , "haha", "dd33", "DD/img/bg.jpg");
        Githuber fabien = new Githuber("Fabien", "fabien@gmail.com" , "hehe", "fab33", "fab");
        Githuber josephine = new Githuber("Josephine", "josephine@gmail.com" , "hihi", "jo33", "josephine");
        Githuber elisa = new Githuber("Elisa", "elisa@gmail.com" , "huhu", "elisa33", "elisa");
        Githuber alexandre = new Githuber("Alexandre", "alex@gmail.com" , "hoho", "alex33", "ui");

        ArrayList<Githuber> githubersList = new ArrayList<Githuber>();
        githubersList.add(andre);
        githubersList.add(fabien);
        githubersList.add(josephine);
        githubersList.add(elisa);
        githubersList.add(alexandre);





        request.setAttribute("andre", andre);
        request.setAttribute("githubersList", githubersList);
        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }
}





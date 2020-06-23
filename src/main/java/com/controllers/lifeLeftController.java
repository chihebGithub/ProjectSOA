package com.controllers;

import com.generated.leftlife.LifeLeft;
import com.generated.leftlife.LifeLeftService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

@WebServlet("/lifeLeftController")
public class lifeLeftController  extends HttpServlet {

    public lifeLeftController (){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LifeLeft lifeleft = new LifeLeft();
        LifeLeftService lifeleftsrv = lifeleft.getLifeLeftServicePort();
        String name = request.getParameter("InputName");
        String sexe = request.getParameter("inputsexe");
        int year=0;
        try {
            year = Integer.parseInt(request.getParameter("InputAge"));
       }catch (Exception exception) {
           exception.printStackTrace();
       }

        String resultat = lifeleftsrv.anneeRestantesAVivre(name, sexe, year);
        request.setAttribute("resultat",resultat);
        request.getRequestDispatcher("/index.jsp").forward(request, response);    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}

package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormulaireServlet")
public class FormulaireServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        response.setContentType("text/html");
        // crée un objet PrintWriter qui sera utilisé pour écrire du texte dans le corps de la réponse HTTP. En utilisant response.getWriter();
        PrintWriter out1 = response.getWriter();
        String nom = request.getParameter("nom");
        String Prenom = request.getParameter("Prenom");
        String DateNaissance  = request.getParameter("DateNaissance");
        String Email  = request.getParameter("Email");
        String Password  = request.getParameter("Password");
        String pays = request.getParameter("pays");
        //String genre = request.getParameter("genre");  // Utilisation d'un seul champ pour le genre (homme ou femme)
        String check = request.getParameter("check");
        String homme = request.getParameter("homme");
        //------------------------------------------------------------------
        out1.println("<h2>Vous avez bien été enregistré</h2>");

        if (check.equals(homme)) {
            out1.println("<h1>Bonjour Monsieur </h1>");
        } else {
            out1.println("<h1>Bonjour Madame </h1>");
        }
        out1.println("<p>Votre prénom est: " + Prenom + "</p>");
        out1.println("<p>Votre nom est: " + nom + "</p>");
        out1.println("<p>Votre date de naissance est: " + DateNaissance + "</p>");
        out1.println("<p>Votre e-mail est: " + Email + "</p>");
        out1.println("<p>Votre mot de passe est: " + Password + "</p>");
        out1.println("<p>Votre pays est :  " + pays + "</p>");
    }

}

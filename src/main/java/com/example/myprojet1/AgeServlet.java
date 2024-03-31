package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/AgeServlet")
public class AgeServlet extends HttpServlet {
    @Override
    //utilisateur accède à votre servlet pour la première fois via un navigateur, la méthode doGet est généralement appelée
    //La méthode doGet est également utilisée pour afficher le contenu initial d'une page, générer un formulaire, ou présenter des informations à l'utilisateur.
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out1 = response.getWriter();

        out1.println("<html><head>");
        out1.println("<title>Les nombres</title>");
        out1.println("</head>");
        out1.println("<body>");
        out1.println("<h1>Choisissez un nombre</h1>");
        out1.println("-------------------------------");
        // ligne horizontale
        out1.println("<hr>");
        // Start of the form
        out1.println("<form method='post'>");
            out1.println("<select name='value' id='value' >");
            out1.println("<option value='Zéro'>Zéro</option>");
            out1.println("<option value='Un'>Un</option>");
            out1.println("<option value='Deux'>Deux</option>");
            out1.println("<option value='Trois'>Trois</option>");
            out1.println("<option value='Quatre'>Quatre</option>");
            out1.println("<option value='Cinq'>Cinq</option>");
            out1.println("<option value='Six'>Six</option>");
            out1.println("<option value='Sept'>Sept</option>");
            out1.println("<option value='Huit'>Huit</option>");
            out1.println("<option value='Neuf'>Neuf</option>");
        out1.println("</select>");
        out1.println("<input type='submit' name='Button' value='Envoyer'>");
        out1.println("</form>"); // End of the form
        out1.println("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //Cette ligne appelle la méthode doGet
        // pour réutiliser la logique de génération du formulaire déjà définie dans doGet, on peut appeler doGet(request, response)
        doGet(request, response); // les deux methode dovient traiter une requete de maniere similaire
        //pour spécifier le type de contenu de la reponse
        response.setContentType("text/html");
        // crée un objet PrintWriter qui sera utilisé pour écrire du texte dans le corps de la réponse HTTP. En utilisant response.getWriter();
        // crée un objet PrintWriter qui sera utilisé pour écrire la reponse
        PrintWriter out1 = response.getWriter();
        String value = request.getParameter("value");
        out1.println("<p>Vous avez choisi </p>");
        //l'affichage
        out1.println(value);
    }


}

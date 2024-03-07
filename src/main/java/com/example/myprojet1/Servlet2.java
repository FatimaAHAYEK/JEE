package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    public int i;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //méthode définit le type de contenu de la réponse
        //response C'est un objet de la classe HttpServletResponse qui représente la réponse HTTP que la servlet envoie au client
        response.setContentType("text/html");
        // out c'est un objet de la classe PrintWriter qui est associé au flux de sortie de la réponse HTTP.
        //cet obj est utilisé pour écrire du texte dans le corps de la réponse qui sera envoyé au client.
        //Cette méthode retourne un objet PrintWriter associé à la réponse, permettant à la servlet d'écrire du contenu dans la réponse HTTP
        PrintWriter out = response.getWriter();
        //getCookies() cette méthode est utilisée pour récupérer tous les cookies inclus dans la requête
        //request c'est un objet de la classe HttpServletRequest qui représente la requête HTTP reçue par la servlet du client
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            String Nom = request.getParameter("Nom");

            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
               // pour afficher les parametre de Cookie
               // out.println("Cookie Name: " + name + "<br>");
               // out.println("Cookie Value: " + value + "<br>");

                if ("Nom".equals(name)) {
                    Nom = value;
                }
            }

            if (Nom != null && !Nom.isEmpty()) {
                out.println("Hello " + Nom);
            } else {
                out.println("Le paramètre 'Nom' n'a pas été trouvé dans la requête.");
            }
        } else {
            out.println("Aucun cookie trouvé dans la requête.");
        }

}
}
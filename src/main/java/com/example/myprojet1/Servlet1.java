package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1", value = "/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String Nom = request.getParameter("Nom");
        out.println("<html><body>");
        //body ona l'action to the servlet2 avec une methode Post
        out.println("<form action='Servlet2' method='post'>");
        // affichage de la varibale nom
        out.println("Welcome" + Nom);
        out.println("</br>");
        out.println("<input type='submit' value='Go'>");
        out.println("</form>");
        out.println("</body></html>");
        //un cookie comme une petite unité de stockage côté client qui peut être utilisée pour stocker des informations spécifiques.
        // creation d'un nouvel objet cookie avec le nom "Nom"
        Cookie Mycookie = new Cookie("Nom", Nom);
        //le cookie sera inclus dans la réponse envoyée au navigateur du client
        //Une fois que le navigateur reçoit ce cookie, il le stockera localement et l'inclura dans les futures demandes vers le même domaine.
        response.addCookie(Mycookie);
    }
}


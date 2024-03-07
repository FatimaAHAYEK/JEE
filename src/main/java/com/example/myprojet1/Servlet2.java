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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0) {
            String nomValue = null;

            // Recherche du cookie avec le nom "Nom"
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("Nom")) {
                    nomValue = cookie.getValue();
                    break;
                }
            }

            if (nomValue != null) {
                out.println("<html><body>");
                out.println("Hello " + nomValue);
                out.println("</body></html>");
            } else {
                out.println("<html><body>");
                out.println("No 'Nom' cookie found");
                out.println("</body></html>");
            }
        } else {
            // Aucun cookie trouvé, mais pas de message affiché
            out.println("<html><body>");
            out.println("</body></html>");
        }

        out.close();

    }
}
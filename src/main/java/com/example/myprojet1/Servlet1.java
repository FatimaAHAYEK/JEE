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
        out.println("<form action='Servlet2' methode='post'>");
        out.println("Hello"+Nom);
        out.println("<input type='submit' value='Go'>");
        out.println("</form>");
        out.println("</body></html>");

        Cookie Mycookie = new Cookie("Nom", Nom);
        response.addCookie(Mycookie);
    }
}


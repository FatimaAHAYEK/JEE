package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servletcompture")
public class Servletcompture extends HttpServlet {
    public int compteur;
    @Override

    public void init() throws ServletException{
        compteur=0;
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //spécifier le type de contenu de la reponse
        response.setContentType("test/html");
        PrintWriter out = response.getWriter();
        compteur++;
        out.println("depuis son charegement en accédé a cette servlet " +compteur+ "fois");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

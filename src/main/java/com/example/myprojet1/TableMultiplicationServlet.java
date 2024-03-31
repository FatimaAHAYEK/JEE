package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TableMultiplicationServlet")
public class TableMultiplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //  Génération d'un tableau HTML avec les résultats de multiplication
        out.println("<body>");
        out.println("<h1>Table Multiplication </h1>");
        out.println("<table border='1'>");

        // Ligne d'en-tête avec X en gras sur fond jaune
        out.println("<tr style='background-color: yellow;'>");
        out.println("<th>X</th>");

        // Première rangée avec les chiffres de 1 à 10 en gras sur fond gris
        for (int i = 1; i <= 10; i++) {
            out.println("<th style='background-color: gray;'>" + i + "</th>");
        }

        out.println("</tr>");

        // Générer des résultats de multiplication pour chaque ligne et colonne
        for (int i = 1; i <= 10; i++) {
            out.println("<tr>");
            // Première colonne avec les chiffres de 1 à 10 en gras sur fond gris
            out.println("<td style='font-weight: bold; background-color: gray;'>" + i + "</td>");

            // Résultats de multiplication pour chaque colonne
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                out.println("<td style='text-align: center;'>" + result + "</td>");
            }

            out.println("</tr>");
        }

        out.println("</table>");

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

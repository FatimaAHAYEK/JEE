package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       // request.getRequestDispatcher("link1.html").include(request, response);
        String Nom = request.getParameter("Nom");
        String MDP = request.getParameter("MDP");
        if(MDP.equals("Fatima2024")){
            // So this is the first successful login scenario1
            request.getRequestDispatcher("link1.html").include(request, response);
            out.println("</br>");
            // So this is the successful login scenario3
            out.print("Welcome, "+Nom );
            HttpSession session=request.getSession();
            session.setAttribute("name",Nom );
        }
        else{
            //Si le premier scenario1 echoue
            //in this scenario2
            //if the password fails display a message for password recovery
            out.print("Sorry!, Username or password erreur ! ");
            out.print("</br>");
            out.print("Try again");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }
}


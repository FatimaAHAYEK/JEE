package com.example.myprojet1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogoutServlet", value = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    // So this is the first successful login scenario1
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     out.println("<h1>Login Application using HttpSession</h1>");
     out.println("</br>");
     request.getRequestDispatcher("link.html").include(request, response);
     out.println("</br>");
     HttpSession session=request.getSession();
     session.invalidate();
     out.print("You are successfully logged out!");
     out.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

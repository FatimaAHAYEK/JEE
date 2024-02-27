package com.example.myprojet1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       //Cette ligne définit le type de contenu de la réponse HTTP générée par la servlet il est défini comme "text/html", indiquant au navigateur que le contenu de la réponse est du texte HTML. Cela assure que le navigateur interprétera correctement le contenu HTML envoyé par la servlet.
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.println("<h2>---------------------</h2>");
        out.println("<h2>Hello servlet</h2>");
        out.println("<h2>---------------------</h2>");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        out.println("Date and Time: " + sdf.format(date));

    }

    public void destroy() {
    }
}
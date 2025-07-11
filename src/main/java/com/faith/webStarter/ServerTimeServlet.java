package com.faith.webStarter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(value = "/server-time", name = "Server Time")
public class ServerTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.print("<p> Server Time: ");
        writer.print(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
        writer.print("</p>\n");
        writer.println("</body>");
        writer.println("</html>");
    }
}

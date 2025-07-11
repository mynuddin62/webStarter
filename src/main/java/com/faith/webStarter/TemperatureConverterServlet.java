package com.faith.webStarter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/convert")
public class TemperatureConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var writer = resp.getWriter();
        var temperature = req.getParameter("temperature");
        if (temperature != null && temperature.length() > 0) {
            double temperatureInC =
                    Double.parseDouble(temperature);
            double temperatureInF =
                    (temperatureInC * 9 / 5) + 32;

            writer.println("<html>");
            writer.println("  <head>");
            writer.println("    <title>Temperature Converter</title>");
            writer.println("  </head>");
            writer.println("  <body>");
            writer.println("    <p>Temperature in Fahrenheit is: "
                    + temperatureInF + "</p>");
            writer.println("  </body>");
            writer.println("</html>");
            return;
        }

        writer.println("<html>");
        writer.println("  <head>");
        writer.println("    <title>Temperature Converter</title>");
        writer.println("  </head>");
        writer.println("  <body>");
        writer.println("    <h1>Celsius to Fahrenheit conversion</h1>");
        writer.println("    <form action=\"/convert\" method=\"/get\">");
        writer.println("      <input type=\"number\" name=\"temperature\"/>");
        writer.println("      <input type=\"submit\" value=\"Submit\"/>");
        writer.println("    </form>");
        writer.println("  </body>");
        writer.println("</html>");
    }

}
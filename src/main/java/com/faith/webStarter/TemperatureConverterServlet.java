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
        req.getRequestDispatcher("/WEB-INF/convert.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var temperature = req.getParameter("temperature");
        if (temperature != null && !temperature.isEmpty()) {
            double temperatureInC = Double.parseDouble(temperature);
            double temperatureInF = (temperatureInC * 9 / 5) + 32;
            req.setAttribute("result", temperatureInF);
        }

        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req,resp);
    }
}
package by.tms.servlet.calculator;

import by.tms.servlet.calculator.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")

public class CalculatorServlet extends HttpServlet {

    private CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        int number_1 = Integer.parseInt(req.getParameter("number_1"));
        int number_2 = Integer.parseInt(req.getParameter("number_2"));
        String operation = req.getParameter("operation");
        double calculate = calculatorService.calculate(number_1, number_2, operation);
        resp.getWriter().println("result " + calculate);

    }
}


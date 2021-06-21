package by.tms.servlet.registration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.servlet.registration.InMemoryStorage.createUser;
import static by.tms.servlet.registration.InMemoryStorage.userExists;

@WebServlet("/registration")

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = createUser(name, username, password);

        if (userExists(user)) {
            resp.getWriter().println("User already exists in the system. " +
                    "Please, register with another credentials.");
        } else {
            resp.getWriter().println("User is successfully registered.");
        }
    }
}



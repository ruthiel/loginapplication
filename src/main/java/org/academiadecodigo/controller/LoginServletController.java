package org.academiadecodigo.controller;

import org.academiadecodigo.auth.Authenticator;
import org.academiadecodigo.model.User;
import org.academiadecodigo.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by codecadet on 08/12/16.
 */
public class LoginServletController extends HttpServlet {

    private UserService userService;
    private Authenticator authenticator;

    static Logger logger = LogManager.getLogger();

    @Override
    public void init() throws ServletException {
        userService = (UserService) getServletContext().getAttribute("userService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");

        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Logger byClass = LogManager.getLogger(LoginServletController.class);
        Logger byName = LogManager.getLogger("org.academiadecodigo.controller.LoginServletController");

        String username = req.getParameter("formName");
        String password = req.getParameter("formPassword");
        String email = req.getParameter("formEmail");

        User user= new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        RequestDispatcher dispatcher = null;

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) { // TODO: 12/12/16 missing authenticate
            dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
            dispatcher.forward(req, resp);
        } else {
            dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/main.jsp");

            userService.addUser(user);
            req.setAttribute("user", user);
            dispatcher.forward(req, resp);
        }

        if (byClass != byName && byName != logger) {
            logger.error("Loggers not the same!");
        }

        logger.warn("This is a warning!");

    }
}

package org.academiadecodigo.controller;

import org.academiadecodigo.auth.Authenticator;
import org.academiadecodigo.model.User;
import org.academiadecodigo.service.UserService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.management.Attribute;
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
    private RequestDispatcher formtDispatcher;

    private static final Logger logger = LogManager.getLogger(LoginServletController.class);

    @Override
    public void init() throws ServletException {

        logger.log(Level.INFO, "Initializing Servlet");
        authenticator = (Authenticator) getServletContext().getAttribute(org.academiadecodigo.app.Attribute.AUTH_SERVICE);
        userService = (UserService) getServletContext().getAttribute(org.academiadecodigo.app.Attribute.USER_SERVICE);
        formtDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.log(Level.INFO, "Get request received");
        formtDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.log(Level.INFO, "POST request received");

        String username = req.getParameter(org.academiadecodigo.app.Attribute.USER_NAME);
        String password = req.getParameter(org.academiadecodigo.app.Attribute.USER_PASSWORD);

        if (username == null || username.isEmpty() ||
                password == null || password.isEmpty()) {
            resp.sendRedirect("/login");
            logger.log(Level.INFO, "Test");
            return;
        }

        if (authenticator.authenticate(username, password)) {
            logger.log(Level.INFO, "Authentication succeed for " + username);

            req.getSession().setAttribute(org.academiadecodigo.app.Attribute.USER_NAME, username);
            req.getSession().setAttribute(org.academiadecodigo.app.Attribute.AUTH_STATE, false);
            req.getSession().setAttribute(org.academiadecodigo.app.Attribute.USER_LIST, userService.findAll());

            RequestDispatcher mainDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/main.jsp");
            mainDispatcher.forward(req, resp);
        } else {

            logger.log(Level.INFO, "Authentication failed!");

            req.getSession().setAttribute(org.academiadecodigo.app.Attribute.AUTH_STATE, true);
            formtDispatcher.forward(req, resp);

        }

    }

}


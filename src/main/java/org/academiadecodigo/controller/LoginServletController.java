package org.academiadecodigo.controller;

import org.academiadecodigo.model.User;
import org.academiadecodigo.service.MockUserService;
import org.academiadecodigo.service.UserService;

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
    private User user;

    @Override
    public void init() throws ServletException {
        userService = (UserService) getServletContext().getAttribute("mockUserService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");

        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("formName");
        String password = req.getParameter("formPassword");

        user = new User();
        user.setUsername(username);
        user.setPassword(password);

        RequestDispatcher dispatcher = null;

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
        }
            dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/main.jsp");

        userService.addUser(user);
        req.setAttribute("user", user);
        dispatcher.forward(req, resp);






    }
}

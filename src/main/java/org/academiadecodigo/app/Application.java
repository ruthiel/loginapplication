package org.academiadecodigo.app;

import org.academiadecodigo.auth.Authenticator;
import org.academiadecodigo.service.MockUserService;
import org.academiadecodigo.service.UserService;

import javax.management.Attribute;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by codecadet on 08/12/16.
 */
public class Application implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext ctx = servletContextEvent.getServletContext();

        Authenticator authenticator = new Authenticator();
        UserService userService = new MockUserService();
        authenticator.setUserService(userService);

        ctx.setAttribute(
        ctx.setAttribute(
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

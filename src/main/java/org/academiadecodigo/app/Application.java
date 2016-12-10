package org.academiadecodigo.app;

import org.academiadecodigo.service.MockUserService;
import org.academiadecodigo.service.UserService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by codecadet on 08/12/16.
 */
public class Application implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        UserService mockUserService = new MockUserService();
        servletContextEvent.getServletContext().setAttribute("mockUserService", mockUserService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

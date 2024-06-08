package com.samanecorparation.security.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samanecorparation.security.dto.UserDto;
import com.samanecorparation.security.service.IUserService;
import com.samanecorparation.security.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "admin",value = "/admin")
public class AdminServlet extends HttpServlet {
	
	private IUserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// Passer la liste des utilisateurs à la vue JSP
    	req.setAttribute("users", userService.getAll());
    	req.getRequestDispatcher("WEB-INF/jsp/users/list.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        UserDto userDto = new UserDto(0, firstName, lastName, email, password);
        userService.save(userDto);
        
        doGet(req, resp);
    }
}

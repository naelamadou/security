package com.samanecorparation.security.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samanecorparation.security.dto.UserDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "admin",value = "/admin")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	List<UserDto> users = new ArrayList<UserDto>();
    	for (int i = 1; i < 4; i++) {
    		UserDto user = new UserDto(i, "Amadou" + i, "NAEL" + i, "naelamadou" + i + "@gmail.com");
    	    users.add(user);
		}
    	// Passer la liste des utilisateurs à la vue JSP
    	req.setAttribute("users", users);
    	req.getRequestDispatcher("WEB-INF/jsp/users/list.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

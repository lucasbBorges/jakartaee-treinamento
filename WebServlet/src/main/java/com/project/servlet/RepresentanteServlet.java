package com.project.servlet;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.project.ejb.FirstBean;


@WebServlet("/RepresentanteServlet")
public class RepresentanteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private FirstBean firstBean;
	
    public RepresentanteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("First Server says: ").append(firstBean.helloWorld());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioPersistido = "Lucas";
		String senha = "123";
		
		String usuarioRequest = request.getParameter("username");
		String senhaRequest = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		response.setContentType("Text/Html");
		
		if (usuarioPersistido.equals(usuarioRequest) && senha.equals(senhaRequest)) {
			out.println("<h3>Usuário Autenticado</h3>");
		} else {
			out.println("<h3>Usuário ou senha incorretos</h3>");
			out.println("<a href\"localhost:8080/WebServlet/LoginForm.html\">Voltar</a>");
		}
	}

}

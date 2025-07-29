package com.project.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.project.ejb.UsuarioService;
import com.project.model.Usuario;


@WebServlet("/UsuarioServlet/listar")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private UsuarioService usuarioService;
	
    public UsuarioServlet() {
        super();
    }
    

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("Text/Html");
		List<Usuario> usuarios = usuarioService.listarUsuarios();
		out.println("<h3>Usuários Listados:</h3>");
		out.println("<ul>");
		usuarios.forEach(usuario -> out.println("<li>"+ usuario.getName() +"</li>"));
	}

}

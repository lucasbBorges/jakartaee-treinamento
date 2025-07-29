package com.project.ejb;

import java.util.List;

import com.project.model.Usuario;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UsuarioService {
	@PersistenceContext(unitName = "PU")
	EntityManager em;
	
	public UsuarioService () {};
	
	public List<Usuario> listarUsuarios() {
		return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
	}
}

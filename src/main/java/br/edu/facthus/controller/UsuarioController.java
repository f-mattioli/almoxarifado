package br.edu.facthus.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.entity.Usuario;
import br.edu.facthus.service.UsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	
	@Inject
	private UsuarioService usuarioService;

	private Usuario usuario = new Usuario();
	
	private List<Usuario> usuarios = new ArrayList<>();

	public void cadastra() {
		usuarioService.cadastra(usuario);
	}

	public void lista() {
		usuarios = usuarioService.buscausuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
}

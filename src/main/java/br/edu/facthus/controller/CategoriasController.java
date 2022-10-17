package br.edu.facthus.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.entity.Categoria;
import br.edu.facthus.service.CategoriasService;

@Named
@RequestScoped
public class CategoriasController {
	
	@Inject
	private CategoriasService categoriasService;

	private Categoria categoria = new Categoria();
	
	private List<Categoria> categorias = new ArrayList<>();

	public void cadastra() {
		categoriasService.cadastra(categoria);
	}

	public void lista() {
		categorias = categoriasService.buscaCategorias();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	
}

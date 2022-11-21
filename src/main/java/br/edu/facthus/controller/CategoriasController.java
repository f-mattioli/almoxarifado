package br.edu.facthus.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.entity.Categoria;
import br.edu.facthus.service.CategoriasService;
import br.edu.facthus.utils.FacesUtils;

@Named
@ViewScoped
public class CategoriasController implements Serializable {
	
	@Inject
	private CategoriasService categoriasService;

	private Categoria categoria = new Categoria();
	
	private List<Categoria> categorias = new ArrayList<>();

	@PostConstruct
	public void init() {
		categorias = categoriasService.buscaCategorias();
	}

	public void cadastra() {
		try {
			categoriasService.cadastra(categoria);
			categoria = new Categoria();
			categorias = categoriasService.buscaCategorias();
		} catch (Exception e) {
			FacesUtils.showError("Ocorreu um erro ao cadastrar a categoria.");
		}
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

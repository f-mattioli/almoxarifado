package br.edu.facthus;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.entity.Contato;
import br.edu.facthus.service.ContatosService;

@Named
@RequestScoped
public class IndexView {
	
	@Inject
	private ContatosService contatosService;

	private Contato contato = new Contato();
	
	private List<Contato> contatos = new ArrayList<>();

	public void cadastra() {
		contatosService.cadastra(contato);
	}

	public void lista() {
		contatos = contatosService.lista();
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
}

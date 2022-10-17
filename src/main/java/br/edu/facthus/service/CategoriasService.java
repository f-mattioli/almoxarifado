package br.edu.facthus.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.entity.Categoria;

@Stateless
public class CategoriasService {

    @PersistenceContext
    private EntityManager entityManager;

    public void cadastra(Categoria categoria) {
        entityManager.persist(categoria);
    }

    public List<Categoria> buscaCategorias() {
        return entityManager
            .createNamedQuery("Categoria.findAll", Categoria.class)
            .getResultList();
    }
    
}

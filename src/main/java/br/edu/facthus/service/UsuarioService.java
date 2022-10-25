package br.edu.facthus.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.entity.Usuario;

@Stateless
public class UsuarioService {

    @PersistenceContext
    private EntityManager entityManager;

    public void cadastra(Usuario usuario) {
        entityManager.persist(usuario);
    }

    public List<Usuario> buscausuario() {
        return entityManager
            .createNamedQuery("Usuario.findAll", Usuario.class)
            .getResultList();
    }
    
}

package br.edu.facthus.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.entity.Contato;

@Stateless
public class ContatosService {

    @PersistenceContext
    private EntityManager entityManager;

    public void cadastra(Contato contato) {
        entityManager.persist(contato);
        System.out.println("Contato inserido com sucesso!");
    }

    public List<Contato> lista() {
        return entityManager
            .createQuery("SELECT c FROM Contato c", Contato.class)
            .getResultList();
    }
    
}

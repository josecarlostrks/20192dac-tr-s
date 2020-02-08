package br.com.trks.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.trks.entidades.InscricaoEfetuada;

@Stateless
public class InscricaoEfetuadaDao {
	
	@PersistenceContext(unitName = "dac")
	EntityManager em;
	
	
	public void salvar(InscricaoEfetuada efetuada) {
		em.persist(efetuada);
	}
	
	public void atualizar(InscricaoEfetuada atualizada) {
		em.merge(atualizada);
	}
	
	public InscricaoEfetuada buscar(Integer id) {
		return em.find(InscricaoEfetuada.class, id);
	}
	
	public List<InscricaoEfetuada> listar(){
		return em.createQuery("SELECT i FROM Aluno i", InscricaoEfetuada.class).getResultList();
	}

}

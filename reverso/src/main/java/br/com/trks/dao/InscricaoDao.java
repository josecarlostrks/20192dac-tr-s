package br.com.trks.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.trks.entidades.Inscricao;

@Stateless
public class InscricaoDao {
	
	@PersistenceContext(unitName="dac")
	EntityManager em;
	
	public void salvar(Inscricao i) {
		em.persist(i);
	}
	
	public void atualizar(Inscricao i) {
		em.merge(i);
	}
	
	public Inscricao buscar(Integer id) {
		return em.find(Inscricao.class, id);
	}
	
	public List<Inscricao> listar(){
		return em.createQuery("SELECT i FROM Inscricao i",Inscricao.class).getResultList();
	}

}

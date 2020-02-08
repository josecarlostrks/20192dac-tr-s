package br.com.trks.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.trks.entidades.Artigo;

@Stateless
public class ArtigoDao {
	
	@PersistenceContext(unitName="dac")
	EntityManager em;
	
	public void salvar(Artigo a) {
		em.persist(a);
	}
	
	public void atualizar(Artigo a) {
		em.merge(a);
	}
	
	public Artigo buscar(Integer id) {
		return em.find(Artigo.class, id);
	}
	
	public List<Artigo> listar(){
		return em.createQuery("SELECT a FROM Artigo a", Artigo.class).getResultList();
	}

}

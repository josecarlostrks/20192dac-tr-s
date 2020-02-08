package br.com.trks.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.trks.entidades.Participante;

@Stateless
public class ParticipanteDao {
	
	@PersistenceContext(unitName="dac")
	EntityManager em;
	
	public void salvar(Participante p) {
		em.persist(p);
	}
	
	public void atualizar(Participante p) {
		em.merge(p);
	}
	
	public Participante buscar(Integer id) {
		return em.find(Participante.class, id);
	}
	
	public List<Participante> listar(){
		return em.createQuery("SELECT p FROM participantes p",Participante.class).getResultList();
	}

}

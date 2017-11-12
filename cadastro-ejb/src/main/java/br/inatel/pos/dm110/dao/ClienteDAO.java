package br.inatel.pos.dm110.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.pos.dm110.entidades.Cliente;

@Stateless
public class ClienteDAO {

	@PersistenceContext(unitName = "cadastrodb")
	private EntityManager em;

	public List<Cliente> listarTodosClientes() {
		return em.createQuery("from Cliente c", Cliente.class).getResultList();
	}

	public void inserir(Cliente cliente) {
		em.persist(cliente);
	}

}

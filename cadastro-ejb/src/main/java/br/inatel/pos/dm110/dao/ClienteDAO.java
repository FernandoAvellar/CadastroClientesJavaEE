package br.inatel.pos.dm110.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.pos.dm110.entidades.EntidadeCliente;

@Stateless
public class ClienteDAO
{

    @PersistenceContext (unitName = "cadastrodb")
    private EntityManager em;

    public List<EntidadeCliente> listarTodosClientes()
    {
        return em.createQuery("from EntidadeCliente c", EntidadeCliente.class).getResultList();
    }

    public void inserir(EntidadeCliente cliente)
    {
        em.persist(cliente);
    }

}

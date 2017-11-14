package br.inatel.pos.dm110.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.dm110.api.CadastroService;
import br.inatel.pos.dm110.interfaces.CadastroRemoto;
import br.inatel.pos.dm110.modelo.Cliente;

@RequestScoped
public class CadastroServiceImpl implements CadastroService
{

    @EJB (lookup = "java:app/cadastro-ejb-0.1-SNAPSHOT/CadastroBean!br.inatel.pos.dm110.interfaces.CadastroRemoto")
    private CadastroRemoto cadastroBean;

    @Override
    public List<Cliente> listaTodosClientes()
    {
        return cadastroBean.listarClientes();
    }

    @Override
    public Cliente criaNovoCliente(Cliente cliente)
    {
        cadastroBean.cadastrarNovoCliente(cliente);
        return cliente;
    }

}

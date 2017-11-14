package br.inatel.pos.dm110.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.pos.dm110.dao.ClienteDAO;
import br.inatel.pos.dm110.entidades.EntidadeCliente;
import br.inatel.pos.dm110.interfaces.CadastroLocal;
import br.inatel.pos.dm110.interfaces.CadastroRemoto;
import br.inatel.pos.dm110.modelo.Cliente;

@Stateless
@Remote (CadastroRemoto.class)
@Local (CadastroLocal.class)
public class CadastroBean implements CadastroRemoto, CadastroLocal
{

    @EJB
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> listarClientes()
    {

        List<Cliente> listaClientes = new ArrayList<>();

        List<EntidadeCliente> listaEntidadeClientes = clienteDAO.listarTodosClientes();
        for (EntidadeCliente entidadeCliente : listaEntidadeClientes)
        {
            Cliente cliente = new Cliente();
            cliente.setId(entidadeCliente.getId());
            cliente.setNome(entidadeCliente.getNome());
            cliente.setEmail(entidadeCliente.getEmail());
            listaClientes.add(cliente);
        }

        return listaClientes;

    }

    @Override
    public Cliente cadastrarNovoCliente(Cliente cliente)
    {
        EntidadeCliente entidadeCliente = new EntidadeCliente(cliente.getNome(), cliente.getEmail());
        clienteDAO.inserir(entidadeCliente);

        return cliente;
    }

}

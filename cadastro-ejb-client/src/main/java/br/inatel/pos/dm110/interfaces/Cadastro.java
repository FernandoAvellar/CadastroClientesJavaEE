package br.inatel.pos.dm110.interfaces;

import java.util.List;

import br.inatel.pos.dm110.modelo.Cliente;

public interface Cadastro
{

    List<Cliente> listarClientes();

    Cliente cadastrarNovoCliente(Cliente cliente);

}

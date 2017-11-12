package br.inatel.pos.dm110.bean;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.pos.dm110.dao.ClienteDAO;
import br.inatel.pos.dm110.entidades.Cliente;
import br.inatel.pos.dm110.interfaces.CadastroLocal;
import br.inatel.pos.dm110.interfaces.CadastroRemoto;

@Stateless
@Remote(CadastroRemoto.class)
@Local(CadastroLocal.class)
public class CadastroBean implements CadastroRemoto, CadastroLocal {

	@EJB
	private ClienteDAO clienteDAO;

	@Override
	public List<String> listarClientes() {
		return clienteDAO.listarTodosClientes().stream().map(Cliente::getNome).collect(Collectors.toList());
	}

	@Override
	public void cadastrarNovoCliente(String nome, String email) {
		Cliente cliente = new Cliente(nome, email);
		clienteDAO.inserir(cliente);
	}

}

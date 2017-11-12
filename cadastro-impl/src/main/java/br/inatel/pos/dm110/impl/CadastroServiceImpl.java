package br.inatel.pos.dm110.impl;

import java.util.List;

import javax.ejb.EJB;

import br.inatel.pos.dm110.api.CadastroService;
import br.inatel.pos.dm110.interfaces.CadastroRemoto;

public class CadastroServiceImpl implements CadastroService {

	@EJB(lookup="java:app/cadastro-ejb-0.1-SNAPSHOT/CadastroBean!br.inatel.pos.dm110.interfaces.CadastroRemoto")
	private CadastroRemoto cadastroBean;

	@Override
	public List<String> listaTodosClientes() {
		return cadastroBean.listarClientes();
	}

	@Override
	public void criaNovoCliente(String nome, String email) {
		cadastroBean.cadastrarNovoCliente(nome, email);
	}

}

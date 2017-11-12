package br.inatel.pos.dm110.interfaces;

import java.util.List;

public interface Cadastro {

	List<String> listarClientes();

	void cadastrarNovoCliente(String nome, String email);

}

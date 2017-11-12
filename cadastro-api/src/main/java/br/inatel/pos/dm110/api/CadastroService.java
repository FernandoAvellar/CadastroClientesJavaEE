package br.inatel.pos.dm110.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/servicoCadastro")
public interface CadastroService {

	@GET
	@Path("/cliente")
	@Produces(MediaType.APPLICATION_JSON)
	List<String> listaTodosClientes();

	@POST
	@Path("/cliente/{nome}/{email}")
	void criaNovoCliente(@PathParam("nome") String nome, @PathParam("email") String email);

}

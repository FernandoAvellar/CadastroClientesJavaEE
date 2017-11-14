package br.inatel.pos.dm110.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.inatel.pos.dm110.modelo.Cliente;

@Path ("/servicoCadastro")
public interface CadastroService
{

    @GET
    @Path ("/cliente")
    @Produces (MediaType.APPLICATION_JSON)
    List<Cliente> listaTodosClientes();

    @POST
    @Path ("/cliente")
    @Consumes (MediaType.APPLICATION_JSON)
    @Produces (MediaType.APPLICATION_JSON)
    Cliente criaNovoCliente(Cliente cliente);

}

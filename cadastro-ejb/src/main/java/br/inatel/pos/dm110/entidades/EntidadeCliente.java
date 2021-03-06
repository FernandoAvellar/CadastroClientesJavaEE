package br.inatel.pos.dm110.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "clientes")
public class EntidadeCliente
{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;

    public EntidadeCliente()
    {
    }

    public EntidadeCliente(int id, String nome, String email)
    {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public EntidadeCliente(String nome, String email)
    {
        this.nome = nome;
        this.email = email;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}

package entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Produto implements Serializable {
    private Integer id;
    private  String nome;
    private int quantidade;
    private double preco;
    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = Boolean.parseBoolean(status);
    }
}

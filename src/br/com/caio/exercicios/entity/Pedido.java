package br.com.caio.exercicios.entity;

import java.util.List;

public class Pedido {
    Long id;
    Cliente cliente;
    List<Produto> produtoList;

    public Pedido(Long id, List<Produto> produtoList, Cliente cliente) {
        this.id = id;
        this.produtoList = produtoList;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}

package br.com.caio.exercicios.entity;

import br.com.caio.collections.entity.Consumidor;

import java.util.*;

public class Loja {
    List<Produto> produtoList;
    List<Cliente> clienteList;
    List<Pedido> pedidoList;

    Map<Long, Produto> map = new HashMap<>();

    public Loja() {
        this.produtoList = new ArrayList<>();
        this.clienteList = new ArrayList<>();
        this.pedidoList = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtoList.add(p);
        map.put(p.getId(), p);
    }

    public void removerProduto(Long id) {
        Iterator<Produto> iterator = produtoList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                map.remove(id);
            }
        }
    }

    public void buscarProdutoPorNome(Long id) {
        Produto produto = map.get(id);

        if(produto != null){
            System.out.println(produto);
        }
        }


    public void retornarLista() {
        produtoList.forEach(System.out::println);
    }
}
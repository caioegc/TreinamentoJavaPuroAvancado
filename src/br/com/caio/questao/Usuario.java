//package br.com.caio.questao;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class Usuario {
//  private  String id;
//  private  String nome;
//  private  List<Livro> livroEmprestados;
//
//
//    public Usuario(String id, String nome, List<Livro> livroEmprestados) {
//        this.id = id;
//        this.nome = nome;
//        this.livroEmprestados = livroEmprestados = new ArrayList<>();
//    }
//
//    public void emprestarLivro(Livro livro){
//        if(!livro.isEmprestado()){
//        livro.setEmprestado(true);
//        livroEmprestados.add(livro);
//    } else{
//            System.out.println("Esse livro já está emprestado");
//        }
//    }
//
//    public void devolverLivro(String isbn){
//            if(livro.get){
//                livroEmprestados.removeIf(livro -> livro.getIsbn().equals(isbn));
//                livro.setEmprestado(true);
//            }
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public Livro getLivro() {
//        return livro;
//    }
//
//    public void setLivro(Livro livro) {
//        this.livro = livro;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(id, usuario.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
//}

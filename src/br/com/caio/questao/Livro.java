//package br.com.caio.questao;
//
//import java.util.Objects;
//
//public class Livro {
//
//   private String isbn;
//   private String titulo;
//   private String autor;
//   private int anoPublicacao;
//   private boolean emprestado;
//
//    public Livro(String isbn, String titulo, String autor, int anoPublicacao, boolean emprestado) {
//        this.isbn = isbn;
//        this.titulo = titulo;
//        this.autor = autor;
//        this.anoPublicacao = anoPublicacao;
//        this.emprestado = false;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//
//    public void setAutor(String autor) {
//        this.autor = autor;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public int getAnoPublicacao() {
//        return anoPublicacao;
//    }
//
//    public void setAnoPublicacao(int anoPublicacao) {
//        this.anoPublicacao = anoPublicacao;
//    }
//
//    public boolean isEmprestado() {
//        return emprestado;
//    }
//
//    public void setEmprestado(boolean emprestado) {
//        this.emprestado = emprestado;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj == this) return true;
//        if(obj != null && getClass() != obj.getClass()) return false;
//        Livro livro = (Livro) obj;
//        return isbn != null && isbn.equals(livro.isbn);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(isbn);
//    }
//}

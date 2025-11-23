package br.com.caio.meuprojeto;

public abstract class Conta {
    private String nome;
    private int numeroConta;
    private double saldo;
    private final double taxaOperacao;

    public Conta(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.taxaOperacao = 0.15;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getTaxaOperacao() {
        return taxaOperacao;
    }
    
    public void depositar(double valor) {
        if(valor > 0){
            this.saldo = saldo + valor;
        } else{
            System.out.println("Valor do depósito insuficiente");
        }
    }
        public void sacar(double valor){
            if(valor > 0 && valor <= saldo){
                this.saldo = saldo - valor;
            }
            else{
                System.out.println("Saldo insuficiente para saque");
            }
        }

        public abstract void atualizar();
        
    }
    


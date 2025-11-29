package src.br.com.caio.exception;

public abstract class ContaBancaria {
   private String nome;
   private int num;
   private final double taxa = 0.05;
   private double saldo;

   public ContaBancaria (String nome, int num){
       this.nome = nome;
       this.num = num;
       this.saldo = 0;
   }

   public void setNome(String nome){
       this.nome = nome;
   }

   public String getnome(){
       return nome;
   }

   public void setNum(int num){
       this.num = num;
   }
   public int getNum(){
       return num;
   }

   public double getSaldo(){
       return saldo;
   }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa(){
       return taxa;
   }

   public void depositar(double valor){
       if(valor > 0){
           saldo += valor;
       } else{
           throw new ValorInvalidoException();
       }
    }
    public void sacar(double valor){
       if(valor > 0 && saldo > 0 && valor <= saldo){
           saldo -= valor;
       }else{
           throw new SaldoInsuficienteException();
       }
    }

    public void transferir(ContaBancaria destino, double valor){

        if (valor <= 0) {
            throw new ValorInvalidoException();
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException();
        }

        this.saldo -= valor;
        destino.saldo += valor;
    }

    public abstract double atualizar();

}

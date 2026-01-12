package br.com.caio.padraodeprojeto.builder.entity;

public class Pessoa {
  private String primeiroNome;
  private String ultimoNome;
  private String email;

    public Pessoa(String primeiroNome, String email, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.email = email;
        this.ultimoNome = ultimoNome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static final class PessoaBuilder {
        private String primeiroNome;
        private String ultimoNome;
        private String email;

        public PessoaBuilder() {
        }

        public static PessoaBuilder aPessoa() {
            return new PessoaBuilder();
        }

        public PessoaBuilder primeiroNome(String primeiroNome) {
            this.primeiroNome = primeiroNome;
            return this;
        }

        public PessoaBuilder ultimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(primeiroNome, email, ultimoNome);
        }
    }
}

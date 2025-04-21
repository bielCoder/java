package co.user.app;

public class User {
    public String nome;
    public int idade;

    public User(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}


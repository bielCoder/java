package co.home.app;

import co.user.app.User;

public class Home {

    public static void main(String[] args) {
        User user = new User("Gabriel Henrique", 27);
        System.out.println("Nome: " + user.getNome());
        System.out.println("Idade: " + user.idade);

    }
}

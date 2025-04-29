import User.User;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        int i = 0;

        while(i < 10){
            User actualUser = new User("Nome: " + i,"Sobrenome: " + i);
            users.add(actualUser);
            i++;
        }

        System.out.println(users.get(1).getFirstname());
        System.out.println(users.get(1).getLastname());

        User user11 = new User("Nome 1", "Sobrenome 1");

        users.add(user11);

        System.out.println(users.get(2).getFirstname());
        System.out.println(users.get(2).getLastname());

    }
}
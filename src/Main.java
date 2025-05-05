import pa.user.User;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //static

        User userA = new User("Gabriel","Sousa");
        User userB = new User("Lucas","Alves");


        userA.setFirstname("Thiago");
        userB.setFirstname("Marco");

        String firstName = userA.getFirstname();
        String lastName = userA.getLastname();
        System.out.println("First name: " + firstName);

    }
}
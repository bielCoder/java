import pa.user.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User userA = new User("Gabriel","Sousa");
        User userB = new User("Lucas","Alves");

        System.out.println(userA.output());
        System.out.println(userB.output(true));
        System.out.println(userA.toString());

    }
}
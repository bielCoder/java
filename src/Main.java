import pa.user.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User userA = new User("Gabriel","Sousa");
        User userB = new User("Bruno ","Alves");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());

        System.out.println(userA.equals(userA));

    }
}
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        User[] users = new User[10];

        for (int i = 0; i < users.length; i++)
        {
            User userAtual = new User();
            userAtual.setFirstName("Nome:" + i);
            userAtual.setLastName("Último nome:" + i);
            System.out.println(userAtual);
        }
    }
}

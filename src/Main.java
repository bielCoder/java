import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String password = "123456";
        System.out.println("Digite sua senha: ");
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        System.out.println(password.equals(pass));
    }
}
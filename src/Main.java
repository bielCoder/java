import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x = "       Olá mundo,esse é o novo mundo            ";
        System.out.println("Quantidade de caracteres: " + x.length());  // verifica a quantidade de caracterer na string
        System.out.println(x.contains("zulesca"));
        System.out.println(x.indexOf("mundo"));
        System.out.println(x.lastIndexOf("mundo"));
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.trim());

    }
}

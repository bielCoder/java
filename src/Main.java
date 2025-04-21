import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // converter em tipos primitivos (casting)

        double dd = 10.10;
        short ss = 32;

        Scanner scanner = new Scanner(System.in);

        int z = (int) scanner.nextDouble(); // lê um número com vírgula e faz cast para int

        System.out.println(z);
    }
}

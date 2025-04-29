import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "Desconhecido");
        System.out.println(Arrays.toString(names));
    }
}
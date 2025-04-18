//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        sum(5,5);
        minus(5,5);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void minus(int a, int b) {
        System.out.println(a - b);
    }

    static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    static void divide(int a, int b) {}
}
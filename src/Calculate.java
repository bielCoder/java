public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        char operadorAritmetico = args[1].charAt(0);

        switch (operadorAritmetico) {
            case '+':
                sum(x, y);
                break;
            case '-':
                minus(x, y);
                break;
            case '*':
                multiply(x, y);
                break;
            case '/':
                divide(x, y);
                break;
            default:
                System.out.println("Operador inválido: " + operadorAritmetico);
        }
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

    static void divide(int a, int b) {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Erro: divisão por zero!");
        }
    }
}

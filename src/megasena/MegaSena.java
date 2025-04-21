package megasena;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MegaSena {
    public static void main(String[] args) {
        int[][][] matrizes = new int[3][3][3]; // 3 matrizes de 3x3
        Random random = new Random();

        for (int m = 0; m < 3; m++) {
            Set<Integer> numeros = new HashSet<>();
            while (numeros.size() < 9) {
                numeros.add(random.nextInt(60) + 1);
            }

            int index = 0;
            for (int num : numeros) {
                int row = index / 3;
                int col = index % 3;
                matrizes[m][row][col] = num;
                index++;
            }
        }

        // Imprimir as matrizes com layout bonito
        for (int m = 0; m < 3; m++) {
            System.out.println("Matriz " + (m + 1) + ":");
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.printf("%02d ", matrizes[m][row][col]); // Preenche com zero à esquerda
                }
                System.out.println();
            }
            System.out.println(); // linha em branco entre as matrizes
        }
    }
}



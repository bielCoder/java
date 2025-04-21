import java.util.HashMap;
import java.util.Map;

public class Main {

    // Criando meu proprio objeto e  tipos primitivos
    public static void main(String[] args) {
        boolean isLogged = false;
        byte b = 'a';
        char c = 'c';
        String character = "abc";

        Map<String, Object> pessoa = new HashMap<>();
        pessoa.put("nome", "Gabriel");
        pessoa.put("idade", 65);



        System.out.println(pessoa);  // Gabriel
        System.out.println( "O Gabriel tem " + pessoa.get("idade") + " de idade"); // 65
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyFirstProgram {



    public static void main(String[] args) {
         String firstName = "Gabriel";
         String lastName = "Sousa";
         Integer age = 27;
         String rule = "Programador";
         Boolean working = true;
         Double salary = 23.00;
         userCard(firstName, lastName, age,working, rule,  salary);
    }

    static void userCard(String firstName,String lastName,Integer age, Boolean working, String rule, Double salary) {
        System.out.println("Primeiro Nome: "+firstName);
        System.out.println("Segundo Nome: "+lastName);
        System.out.println("Idade: "+age);
        System.out.println("Cargo: " + rule);
        System.out.println("Trabalhando: "+working);
        System.out.println("Salario: "+salary);

    }
}
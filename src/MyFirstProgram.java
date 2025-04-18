//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyFirstProgram {

    static String firstName = "Gabriel";
    static String lastName = "Sousa";
    static Integer age = 27;
    static String jobs = "Programmer";
    static Boolean working = true;
    static Double salary = 23.00;

    public static void main(String[] args) {
        userCard(firstName, lastName, age, jobs, working, salary);
    }

    static void userCard(String firstName,String lastName,Integer age, String working, Boolean jobs, Double salary) {
        System.out.println("Primeiro Nome: "+firstName);
        System.out.println("Segundo Nome: "+lastName);
        System.out.println("Idade: "+age);
        System.out.println("Trabalhando: "+jobs);
        System.out.println("Salario: "+salary);


    }
}
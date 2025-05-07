package co.bank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World");

        //System.out.println(Account.MAX_LENGTH);

        Account account1 = new Account(0001, 1234, "Gabriel");
        boolean succedded = account1.withdraw(500);

        if(!succedded)
        {
            System.out.println("Insufficient funds");
        }


        //System.out.println(account1.MAX_LENGTH);
        //Account account2 = new Account(0002, 1234, "Lucas");
        //System.out.println(account2.MAX_LENGTH);
        //Account account3= new Account(0003, 1234, "Marco");
        //System.out.println(account3.MAX_LENGTH);
        // Criar conta de usuário
        // limitar o nome = 12 caracteres
        // sacar valores
            // Não pode sacar masis do que tem
        // depositar
        // informar  para o usuario as operações (saque, deposito)
    }
}
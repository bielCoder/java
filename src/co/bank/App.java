package co.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    private static int accountCounter = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank(1);
        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {
            System.out.println("\nDigite 'C' para criar uma conta ou 'E' para sair do programa:");
            String op = scanner.nextLine().toUpperCase();

            if (op.equals("C")) {
                System.out.println("Digite seu nome:");
                String name = scanner.nextLine();

                // Gera uma nova conta com identificador único
                Account accountGen = new Account(1, accountCounter++, name);
                santander.insertAccount(accountGen);

                System.out.println("\nConta criada com sucesso!");
                System.out.println("Cliente: " + accountGen.getName());

                System.out.println("Agência: " + accountGen.getAgency());

                operateAccount(accountGen, scanner, df);
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Comando inválido, tente novamente!");
            }
        }

        // Exibir saldo total do banco e saldos individuais
        List<Account> accountsList = santander.getAccounts();
        double totalBankBalance = 0.0;

        System.out.println("\n=== Resumo do Banco ===");
        for (Account ac : accountsList) {
            double balance = ac.getBalance();
            totalBankBalance += balance;
            System.out.println("Cliente: " + ac.getName() + " || Agência: " + ac.getAgency() + " || Conta: " + ac.getAccount() + " || Saldo: R$" + df.format(balance));
        }

        System.out.println("\nSaldo Total do Banco: R$" + df.format(totalBankBalance));
        scanner.close();
    }

    static void operateAccount(Account account, Scanner scanner, DecimalFormat df) {
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("D - Depositar");
            System.out.println("B - Saldo");
            System.out.println("S - Sacar");
            System.out.println("Q - Sair");

            String po = scanner.nextLine().toUpperCase();

            switch (po) {
                case "D":
                    System.out.println("Qual valor deseja depositar?");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    account.deposit(depositAmount);
                    System.out.println("Depósito de R$" + df.format(depositAmount) + " realizado com sucesso!");
                    break;

                case "B":
                    System.out.println("Saldo atual: R$" + df.format(account.getBalance()));
                    break;

                case "S":
                    System.out.println("Qual valor deseja sacar?");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    if (withdrawAmount <= account.getBalance()) {
                        account.withdraw(withdrawAmount);
                        System.out.println("Saque de R$" + df.format(withdrawAmount) + " realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case "Q":
                    System.out.println("Saindo do sistema...");
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}

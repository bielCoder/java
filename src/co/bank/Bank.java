package co.bank;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    private Number ag;
    private List<Account> accounts;
    private int lastAccount;


    public Bank(Number ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void insertAccount(Account account) {
        this.accounts.add(account);
    }

    public Account generateAccount(String name) {
        Account account = new Account(this.ag, null, name);
        lastAccount++;
        this.accounts.add(account);
        return account;
    }
}

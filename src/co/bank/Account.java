package co.bank;

public class Account {
    private Number agency;
    private Number account;
    private String name;
    private double balance;

   private static final int MAX_LENGTH = 12;

    public Account(Number agency, Number account, String name) {
        this.agency = agency;
        this.account = account;
        this.setName(name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
        System.out.println("Account name is " + this.name);
    }

    public Number getAgency() {
        return agency;
    }

    public void setAgency(Number agency) {
        this.agency = agency;
    }

    public Number getAccount() {
        return account;
    }

    public boolean withdraw(double amount) {
        if(balance < amount)
        {
            return false;
        } else {
            balance -= amount;
            System.out.println("Amount to withdraw, \n" +
                    "Insufficient balance");
            return true;
        }


    }
}

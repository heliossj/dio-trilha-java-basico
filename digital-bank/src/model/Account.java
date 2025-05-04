package model;

public abstract class Account implements IAccount {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client){
        this.agency = Account.AGENCIA_PADRAO;
        this.number = Account.SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public void withDrawMoney(double value){
        this.balance -= value;
    }

    @Override
    public void depositMoney(double value){
        this.balance += value;
    }

    @Override
    public void transferMoney(double value, IAccount destinAccount){
        this.withDrawMoney(value);
        destinAccount.depositMoney(value);
    }

    public int getAgency(){
        return this.agency;
    }

    public int getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    protected void printInformationsCostumer(){
        System.out.println("Titular: " + this.client.getName());
        System.out.println("Agência: " + this.getAgency());
        System.out.println("Number: " + this.getNumber());
        System.out.println("Saldo: " + this.getBalance());
    }


}

package model;

public class ContaPoupanca extends Account {
    public ContaPoupanca(Client client){
        super(client);
    }

    @Override
    public void printExtract(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.printInformationsCostumer();
    }
}

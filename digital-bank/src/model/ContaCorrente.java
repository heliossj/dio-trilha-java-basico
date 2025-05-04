package model;

public class ContaCorrente extends Account{
    public ContaCorrente(Client client){
        super(client);
    }

    @Override
    public void printExtract(){
        System.out.println("=== Extrato conta corrente ===");
        super.printInformationsCostumer();
    }


}

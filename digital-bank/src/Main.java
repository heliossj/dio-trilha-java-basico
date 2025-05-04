import model.Account;
import model.Client;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Client helio = new Client();
        helio.setName("Helio");

        Account cc = new ContaCorrente(helio);
        Account poupanca = new ContaPoupanca(helio);

        cc.withDrawMoney(100);
        cc.transferMoney(100, poupanca);

        cc.printExtract();
        poupanca.printExtract();



        System.out.println("Hello world!");
    }
}
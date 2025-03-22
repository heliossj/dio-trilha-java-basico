import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro parametro");
        int firstParam = input.nextInt();
        System.out.println("Informe o segundo parâmetro");
        int secondParam = input.nextInt();

        try{
            contar(firstParam, secondParam);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    static void contar (int param1, int param2) throws Exception {
        if (param1 > param2)
            throw new Exception("O segundo parâmetro deve ser maior do que o primeiro. Verifique!");
        int contagem = param2 - param1;

        for (int inicio = param1; inicio <= param2; inicio++ ){
            System.out.println(inicio);
        }
    }
}
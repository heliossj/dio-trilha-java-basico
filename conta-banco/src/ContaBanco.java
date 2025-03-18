public class ContaBanco {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBanco (int numero, String agencia, String nomeCliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;        
    }
    
}

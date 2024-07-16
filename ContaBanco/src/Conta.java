import java.util.Scanner;

public abstract class Conta implements InterfaceConta{

    private static final int AGECIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    public int numeroConta;
    public int agenciaConta;
    protected Cliente cliente;
    public double saldo = 0d;



    public Conta(Cliente cliente){
        this.agenciaConta = AGECIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;

    }



    @Override
    public void saldo(double valor) {

        System.out.println("Saldo: " + saldo);

    }

    @Override
    public void sacar(double valor) {
        //double sacar = saldo - valor;
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        //double depositar = saldo + valor;

    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfos(){

        System.out.println("Cliente:" + this.cliente.getNome());
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Agencia: " + this.agenciaConta);
        System.out.println("Saldo: " + this.saldo);


    }



    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }




}

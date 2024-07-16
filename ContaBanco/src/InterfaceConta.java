public interface InterfaceConta {

    void saldo(double valor);

    void sacar(double valor);

    void depositar(double valor);

    void transferir (double valor, InterfaceConta contaDestino);

    void imprimirExtrato();

}

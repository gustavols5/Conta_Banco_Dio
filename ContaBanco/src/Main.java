public class Main {

    public static void main(String[] args) {


            Cliente Pedro = new Cliente();
            Pedro.setNome("Pedro");

            Conta cc = new Conta_Corrente(Pedro);
            Conta pp = new Conta_Poupanca(Pedro);



        cc.depositar(100);


        cc.imprimirExtrato();
        pp.imprimirExtrato();



    }
}
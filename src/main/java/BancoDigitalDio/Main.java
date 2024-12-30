package BancoDigitalDio;


public class Main {

    public static void main(String[] args) {
        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");

        Conta cc = new ContaCorrente(eduardo);
        Conta poupanca = new ContaPoupanca(eduardo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
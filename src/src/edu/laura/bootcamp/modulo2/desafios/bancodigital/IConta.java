package src.edu.laura.bootcamp.modulo2.desafios.bancodigital;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}

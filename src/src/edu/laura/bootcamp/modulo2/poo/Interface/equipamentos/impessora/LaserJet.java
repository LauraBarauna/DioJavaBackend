package src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.impessora;

public class LaserJet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO COM LaserJet");
    }
}
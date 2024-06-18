package src.edu.laura.bootcamp.modulo2.poo.Interface.estabelecimento;

import src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.impessora.Deskjet;
import src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.impessora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}

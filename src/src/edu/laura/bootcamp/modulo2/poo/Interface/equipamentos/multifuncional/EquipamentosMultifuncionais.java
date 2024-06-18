package src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.multifuncional;

import src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.copiadora.Copiadora;
import src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.digitalizadora.Digitalizadora;
import src.edu.laura.bootcamp.modulo2.poo.Interface.equipamentos.impessora.Impressora;

public class EquipamentosMultifuncionais implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}

package src.edu.laura.bootcamp.modulo1.sintaxejava.metodos;

public class SmartTv {
    boolean ligada = false;
    String statusTv = "Desligada";
    int canal = 2;
    int volume = 10;

    public boolean ligarTv(){
        ligada = true;
        statusTv = "Ligada";
        return ligada;
    }

    public boolean desligarTv(){
        ligada = false;
        statusTv = "Desligada";
        return ligada;
    }

    public int aumentarCanal(){
        canal++;
        return canal;
    }

    public int diminuirCanal(){
        canal--;
        return canal;
    }

    public int aumentarVolume(){
        volume++;
        return volume;
    }

    public int diminuirVolume(){
        volume--;
        return volume;
    }


}

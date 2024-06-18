package src.edu.laura.bootcamp.modulo2.poo.pilares;

public class Computador {
    public static void main(String[] args) {
        ServicoDeMsg smi = null;

        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new ServicoDeMsg();
        else if(appEscolhido.equals("fbm"))
            smi = new ServicoDeMsg();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}


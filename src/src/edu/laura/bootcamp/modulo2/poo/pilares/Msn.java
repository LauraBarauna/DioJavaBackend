package src.edu.laura.bootcamp.modulo2.poo.pilares;

public class Msn extends ServicoDeMsg{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}


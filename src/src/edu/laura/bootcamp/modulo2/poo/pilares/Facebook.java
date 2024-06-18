package src.edu.laura.bootcamp.modulo2.poo.pilares;

public class Facebook extends ServicoDeMsg{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}


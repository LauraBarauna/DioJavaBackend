package src.edu.laura.bootcamp.modulo2.poo.pilares;

public class Telegram extends ServicoDeMsg{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}

package src.edu.laura.bootcamp.modulo2.poo.pilares;

public abstract class ServicoDeMsg {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}


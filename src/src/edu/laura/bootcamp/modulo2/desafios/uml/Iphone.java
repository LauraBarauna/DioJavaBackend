package src.edu.laura.bootcamp.modulo2.desafios.uml;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando Música no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selencionando Música no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando com Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz com Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página da Internet com Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Página da Internet com Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página da Internet com Iphone");
    }
}

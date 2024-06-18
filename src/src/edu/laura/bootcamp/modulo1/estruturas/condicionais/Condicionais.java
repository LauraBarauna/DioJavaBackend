package src.edu.laura.bootcamp.modulo1.estruturas.condicionais;

public class Condicionais {
    public static void main(String[] args) {

        // Simples
        /*
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
         */

        // ---------------------------------------------------

        // Composta
        /*
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
         */

        // ---------------------------------------------------

        // Encadeada
        /*
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
         */

        // ---------------------------------------------------

        // Ternária
        /*
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Exame" : "Reprovado";
        System.out.println(resultado);
        */

        // ---------------------------------------------------

        // Switch Case

        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}

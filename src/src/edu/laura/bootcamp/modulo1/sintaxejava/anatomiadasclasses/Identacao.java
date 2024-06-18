package src.edu.laura.bootcamp.modulo1.sintaxejava.anatomiadasclasses;

public class Identacao {
    public static void main(String[] args) {

        /*  Errado
        int mediaFinal = 6;
        if(mediaFinal<6)
        System.out.println("Reprovado");
        else if(mediaFinal==6)
        System.out.println("Exame");
        else
        System.out.println("Aprovado");
        */

        // Certo

        int mediaFinal = 6;

        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Exame");
        else
            System.out.println("Aprovado");
    }
}
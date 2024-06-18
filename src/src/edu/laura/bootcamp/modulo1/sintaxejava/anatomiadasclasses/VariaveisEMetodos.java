package src.edu.laura.bootcamp.modulo1.sintaxejava.anatomiadasclasses;

public class VariaveisEMetodos {
    public static void main(String[] args) {

        String primeiroNome = "João";
        String segundoNome = "Ponchiroli";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

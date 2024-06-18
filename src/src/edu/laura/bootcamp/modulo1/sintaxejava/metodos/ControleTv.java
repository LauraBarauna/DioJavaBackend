package src.edu.laura.bootcamp.modulo1.sintaxejava.metodos;

import java.util.Scanner;

public class ControleTv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 0, opcaoCanal, opcaoVolume;

        SmartTv smartTv = new SmartTv();

        while(contador != -1){
            System.out.println("\n Controle de Tv");
            if(smartTv.statusTv.equals("Desligada")){
                System.out.println("Status Tv: Desligada");
            } else {
                System.out.println("Status Tv: Ligada");
                System.out.println("Volume Tv: " + smartTv.volume);
                System.out.println("Canal Tv: " + smartTv.canal);
            }

            System.out.println("\n");

            System.out.println("Informe a ação que deseja fazer");
            System.out.println("-1: Encerrar Programa \n" + "1- Ligar Tv \n" + "2- Desligar Tv \n" +
                    "3- Mudar de Canal \n4- Mudar Volume");
            contador = s.nextInt();

            switch (contador){
                case 1: if(smartTv.ligada){
                    System.out.println("A tv já estava ligada");
                } else {
                    smartTv.ligarTv();
                    System.out.println("Você Ligou a TV");
                }
                    break;
                case 2:  if(!smartTv.ligada){
                    System.out.println("A tv já estava desligada");
                } else {
                    smartTv.desligarTv();
                    System.out.println("A tv foi desligada");
                }
                    break;
                case 3: if(!smartTv.ligada){
                    System.out.println("Você precisa ligar a TV para mudar de canal");
                } else {
                    System.out.println("Você quer aumentar ou diminuir o canal? \n 1- Aumentar   2- Diminuir");
                    opcaoCanal = s.nextInt();

                    if(opcaoCanal == 1){
                        smartTv.aumentarCanal();
                    } else if (opcaoCanal == 2) {
                        if(smartTv.canal == 1){
                            System.out.println("Você chegou no ultimo canal");
                        } else {
                            smartTv.diminuirCanal();
                        }
                    } else {
                        System.out.println("OPÇÃO INVÁLIDA");
                    }
                }
                    break;
                case 4: if(!smartTv.ligada){
                    System.out.println("Você precisa ligar a TV para mudar o volume");
                } else {
                    System.out.println("Você quer aumentar ou diminuir o volume? \n 1- Aumentar   2- Diminuir");
                    opcaoVolume = s.nextInt();

                    if(opcaoVolume == 1){
                        smartTv.aumentarVolume();
                    } else if (opcaoVolume == 2) {
                        if(smartTv.canal == 100){
                            System.out.println("Você chegou no ultimo volume");
                        } else if(opcaoVolume == 0){
                            System.out.println("A tv já esta no mudo");
                        } else {
                            smartTv.diminuirVolume();
                        }
                    } else {
                        System.out.println("OPÇÃO INVÁLIDA");
                    }
                }
                    break;
            }


        }


    }
}

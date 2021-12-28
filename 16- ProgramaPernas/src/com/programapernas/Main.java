package com.programapernas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas voce tem? ");
        int perna = tec.nextInt();
        String tipo;
        switch (perna) {
            case 1:
                tipo = "Sací";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }

        System.out.println("Você é um(a) " + tipo);

    }
}

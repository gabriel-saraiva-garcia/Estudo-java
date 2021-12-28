package com.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n",nome, nota);


    }
}

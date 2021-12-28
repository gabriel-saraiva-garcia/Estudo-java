package com.segundovetor;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner teclado = new Scanner(System.in);
//        System.out.print("Insira o ano em que estamos: ");
        int ano = 2021;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            tot[1] = 29;
//            System.out.println("É ano bissexto");
        }
//        else System.out.println("Não é bissexto");

        System.out.println("Em " + ano + ":");
        for (int i = 0; i < mes.length; i++) {

            System.out.println("O mês " + mes[i] + " tem " + tot[i] + " dias ao todo.");
        }
    }
}

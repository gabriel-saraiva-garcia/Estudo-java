package com.programaidade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner t = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu?");
    int nasc = t.nextInt();
    int idade = 2021 - nasc;
        System.out.println("sua idade é " + idade);
    if(idade >=18) {
        System.out.println("Maior de idade");
    }else {
        System.out.println("Menor de idade");
    }
    }
}

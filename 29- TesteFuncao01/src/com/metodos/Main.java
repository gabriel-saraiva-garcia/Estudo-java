package com.metodos;

public class Main {

    static int soma(int a, int b){
        int s = a+b;
       return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa");
	    int sm = soma(5,2);
        System.out.println("a soma vale: " + sm);
    }
}

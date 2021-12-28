package com.operadoresaritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
/*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2 )/2;
        System.out.println("A média é: " + m);
*/

/*        int numero = 5;
        int valor = 5 + numero ++;
        System.out.println(valor);
        System.out.println(numero);*/

/*        int x = 4;
        x *= 2;
        System.out.println(x);*/

/*         float v = 8.4f;
         int ar = (int) Math.round(v);
        System.out.println(ar);*/

        double random = Math.random();
        int n = (int) (1 + random * (100-1)); //maneira de gerar numeros aleatorios inteiros.
        System.out.println(n);
    }
}

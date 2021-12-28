package com.quartovetor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v + " ");
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("encontrei o valor "+ 1 + " na posição: " + p);
    }
}

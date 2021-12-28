package com.comparacaostring;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Gabriel";
        String nome2 = "Gabriel";
        String nome3 = new String("Gabriel");
//        String resultado = (nome1==nome2) ?"igual": "diferente";
        String resultado = (nome1.equals(nome3)) ?"igual": "diferente"; // para comparar o conteudo dentro de um objeto usamos o equals
// pois se usarmos nome1 == nome3 dirá que eles são diferentes. apesar do conteúdo ser igual a construção é diferente. Para objetos, devemos utilizar.equals()
        System.out.println(resultado);
    }
}

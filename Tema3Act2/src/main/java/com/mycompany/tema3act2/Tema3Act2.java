/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tema3act2;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Tema3Act2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Ingresa un texto");
        texto = teclado.nextLine();
        if (palindromo(texto)) {
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es Palindromo");
        }
    }

    public static boolean palindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("\\s+", "");
        String cadenaInvertida = new StringBuilder(texto).reverse().toString();
        return texto.equals(cadenaInvertida);
    }

}

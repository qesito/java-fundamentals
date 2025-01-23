/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Examen {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, mcd;
        System.out.println("Ingresa un valor");
        valor1 = teclado.nextInt();
        System.out.println("Ingresa otro valor");
        valor2 = teclado.nextInt();
        mcd = calcularMCD(valor1, valor2);
        System.out.println("El maximo comun divisor de " + valor1 + " y " + valor2 + " es: " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int tem = b;
            b = a % b;
            a = tem;
        }
        return a;
    }

}

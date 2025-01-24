/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tema3act3;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Tema3Act3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto, cambio;
        do {
            System.out.println("Ingresa un texto");
            texto = teclado.nextLine();
            if (!texto.isEmpty()){
                cambio = texto.toUpperCase();
                System.out.println(cambio);
            }
            
        }
        while (!texto.isEmpty());
        System.out.println("Adios");
    }
}

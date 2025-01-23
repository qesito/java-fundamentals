// 3. Encontrar número Mayor y Menor: Desarrolla un programa que lea 8 números enteros desde el teclado, los almacene en un array y determine cuál es el número mayor y cuál es el número menor. Muestra ambos números en la consola.

import java.util.Scanner;

public class NumeroMayorYMenor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[8];

        
    for (int i = 0; i < 8; i++) {
      System.out.print("Ingrese un numero: ");
      numeros[i] = scanner.nextInt();
    }

    for (int numero : numeros) {
      if (i == 0 || numero < minNumero) {
        minNumero = numero;
      }
      if (i == 0 || numero > maxNumero) {
        maxNumero = numero;
      }
    }
    
    scanner.close();

    System.out.println("Número menor: " + minNumero);
    System.out.println("Número mayor: " + maxNumero);
  }
} 

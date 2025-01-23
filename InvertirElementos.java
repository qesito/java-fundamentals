// 4. Invertir Elementos: Desarrolla un programa que lea 6 números enteros desde el teclado, los almacene en un array y luego invierta el orden de los elementos. Muestra el array invertido en la consola.

import java.util.Scanner;

public class InvertirElementos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[6];

    for (int i = 0; i < 6; i++) {
      System.out.print("Ingrese un numero: ");
      numeros[i] = scanner.nextInt();
    }

    System.out.println("Array original:");
    for (int numero : numeros) {
      System.out.print(numero + " ");
    }

    System.out.println("\nArray invertido:");
    for (int i = numeros.length - 1; i >= 0; i--) {
      System.out.print(numeros[i] + " ");
    }

    scanner.close();

  }
}

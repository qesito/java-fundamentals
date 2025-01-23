// 4. Invertir Elementos:
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

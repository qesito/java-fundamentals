// 2. Suma de Elementos:
import java.util.Scanner;

public class SumaDeElementos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[5];
    int suma = 0;
    
    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese un numero: ");
      numeros[i] = scanner.nextInt();
    }
    
    for (int numero : numeros) {
      suma += numero;
    }
    scanner.close();

    System.out.println("La suma de los numeros es: " + suma);
  }
} 

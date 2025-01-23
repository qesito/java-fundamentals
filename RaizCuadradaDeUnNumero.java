import java.util.Scanner;

public class RaizCuadradaDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();


        if (numero < 0) {
            System.out.println("La raíz cuadrada de un número negativo no es real.");
        } else {

            double raizCuadrada = Math.sqrt(numero);

            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }


    }
}
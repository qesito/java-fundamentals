import java.util.Scanner;

public class CambiarCaracter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Ingresa una cadena de texto: ");
            String texto = scanner.nextLine();


            System.out.print("Ingresa el carácter que deseas reemplazar: ");
            String caracterAReemplazar = scanner.nextLine();


            System.out.print("Ingresa el nuevo carácter: ");
            String nuevoCaracter = scanner.nextLine();


            String textoModificado = texto.replace(caracterAReemplazar, nuevoCaracter);

            System.out.println("Texto modificado: " + textoModificado);

        }
    }


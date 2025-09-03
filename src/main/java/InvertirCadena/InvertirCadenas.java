package InvertirCadena;

import java.util.Scanner;

public class InvertirCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribir tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Escribir tu apellido:");
        String apellido = sc.nextLine();

        StringBuffer conca = new StringBuffer();
        conca.append(nombre);
        conca.append(" ");
        conca.append(apellido);

        System.out.println("Tu nombre al reves es: " + conca.reverse());
    }
}

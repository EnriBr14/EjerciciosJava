package InvertirCadena;

import java.util.Scanner;

public class InvertirString {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);

        System.out.println("Ingrese la cadena");
        String cadena = word.nextLine();

        for(int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }

        System.out.println("Tamaño de la cadena:" + cadena.length());
    }
}

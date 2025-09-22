package Ciclos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
         Scanner op = new Scanner(System.in);
         int opc = 0;

        while(opc != 4){

            System.out.println("\nMenu");
            opc = op.nextInt();
            if (opc == 1) {
                System.out.println("Seleccionates 1");
            }
            else if (opc == 2) {
                System.out.println("Seleccionates 2");
            }
            else if (opc == 3) {
                System.out.println("Seleccionates 3");
            }
            else if (opc == 4) {

            }
            else {
                System.out.println("Incrrecto");
            }


        }


        }
    }




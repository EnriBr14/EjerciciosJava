import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Boolean continuar = false;

        do{
            int opcion = 0;
            System.out.println("Selecciona un numero");
            if(opcion == 1){
                System.out.println("Tu elejiste el 1");
            }
            else if(opcion == 2){
                System.out.println("Tu elejiste el 2");
            }else{
                System.out.println("Tu elejiste el 3");
                continuar = true;
            }


        }while(continuar == true);
        
    }
}

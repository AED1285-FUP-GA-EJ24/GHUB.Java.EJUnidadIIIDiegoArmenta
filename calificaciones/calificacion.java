package calificaciones;

import java.util.Scanner;
public class Calificacion {
    public void calificacion(){
        //defino variable Scanner
        Scanner teclado = new Scanner(System.in);
        //defino variable de entrada
        short calf;
        System.out.print("Proporcione calificación (1-10):");
        calf= teclado.nextShort();
        switch (calf) {
            case 10:
                System.out.println("Excelente!");
                break;
            case 9:
                System.out.println("Notable");
                break;
            case 8:
            case 7:
                System.out.println("Aprobado");
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("No es posible esa nota");
           
        }

    }
}    
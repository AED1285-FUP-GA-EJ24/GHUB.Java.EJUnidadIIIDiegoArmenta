package hermanos;
import java.util.Scanner;

public class brodiff {
    public void brodiffe(Scanner teclado){

    System.out.print("Ingresa el nombre de hermano: ");
    String broname1 = teclado.nextLine();

    System.out.print("Ingresa la edad de " + broname1 + ": ");
    int broage1 = teclado.nextInt();

    System.out.print("Ingresa el nombre de hermano: ");
    teclado.nextLine();
    String broname2 = teclado.nextLine();

    System.out.print("Ingresa la edad de " + broname2 + ": " );
    int broage2 = teclado.nextInt();

    if (broage1 > broage2) {
        System.out.println(broname1 + " es mayor que " + broname2 + " por " + (broage1 - broage2) + " años.");
    } else if (broage1 < broage2) {
        System.out.println(broname2 + " es mayo que " + broname2 + " por " + (broage2 - broage1) + " años.");
    } else {
        System.out.println(broname1 + " y " + broname2 + " tienen la misma edad.");
    }

    teclado.close();
    }
}

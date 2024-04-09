package difedades;
import java.util.Scanner;
public void difhermanos(Scanner teclado){

    System.out.print("Ingresa el nombre de hermano: ");
    String broname1 = scanner.nextLine();

    System.out.print("Ingresa la edad de " + broname1 + ": ");
    int broage1 = scanner.nextInt();

    System.out.print("Ingresa el nombre de hermano: ");
    scanner.nextLine();
    String broname2 = scanner.nextLine();

    System.out.print("Ingresa la edad de " + broname2 + ": " );
    int broage2 = scanner.nextInt();

    if (broage1 > broage2) {
        System.out.println(broname1 + " es mayor que " + broname2 + " por " + (broage1 - broage2) + " años.");
    } else if (broage1 < broage2) {
        System.out.println(broname2 + " es mayo que " + broname2 + " por " + (broage2 - broage1) + " años.");
    } else {
        System.out.println(broname1 + " y " + broname2 + " tienen la misma edad.");
    }

    scanner.close();
}

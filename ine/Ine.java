package ine;
import java.util.Scanner;
public class Ine {
    public void determinarSiIne(Scanner teclado){
        int añoAct;int añoNac;int años;

        System.out.println("Proporciona tu año actual");
        añoAct = teclado.nextInt();

        System.out.println("Proporciona tu año de nacimiento");
        añoNac = teclado.nextInt();

        años = añoAct - añoNac;

        if (años >= 18) {
            System.out.println("Usted puede tramitar su INE");
        } else {
            System.out.println("Usted no puede tramitar su INE");
        }
    }
}

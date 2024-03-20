package ine;
import java.util.Scanner;
public class Ine {
    public void determinarSiIne(Scanner teclado){
        String resultado;
        int añoAct;int añoNac;int años;

        System.out.println("Proporciona tu año actual");
        añoAct = teclado.nextInt();

        System.out.println("Proporciona tu año de nacimiento");
        añoNac = teclado.nextInt();

        años = añoAct - añoNac;

        if (años >= 18) {
            resultado = "Usted puede tramitar su INE";
        } else {
            resultado = "Usted no puede tramitar su INE";
        }
        System.out.println(resultado);

    }
}

package Promedio;
import java.util.Scanner;

import javax.swing.CellEditor;
public class Promedio{
   public void promedio() {
    Scanner teclado = new Scanner(System.in);

    float r;
    int n;
    final int CENTINELA = -1;
    int acum_calf=0,cuenta=0;
    System.out.println("introduzva la primera calificacion (-1 para terminar)");
    n = tecladonextInt();
    while ( (n!=CENTINELA)){
        cuenta++;
        acum_calf += n;
        System.out.println("PRoporciona SIGUIENTE calificacion" +
                            cuenta+" (-1 para terminar):");
        n =teclado.nextInt();
        
    }
   }

}
package leerX;
import java.util.Scanner;

public class LeerX {
    public void leerX(){
        Scanner teclado = new Scanner(System.in);
        final int Y=99;
        int x;
        System.out.print("Introduce valor de x:");
        x = teclado.nextInt();
        while(x>0){
            System.out.println("Valor de y:"+Y);
            System.out.print("Introduce valor de x:");
            x = teclado.nextInt();
        }
        teclado.close();


    }
    
}
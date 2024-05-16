package promedio3;


import java.util.Scanner;

public class Promedio {
    public void promedio(){
         //objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        float r;
        //variable de entrada
        int n;
        //variables auxiliares
        final int CENTINELA = -1;
        int acum_calf=0,cuenta=0;
        System.out.print("Introduzca la primera calificación (-1 para terminar): ");
        n = teclado.nextInt();
        while (n !=CENTINELA){
            cuenta++;
            acum_calf += n;
            System.out.print("Proporciona SIGUIENTE calificaión "+
                            cuenta+" (-1 para Terminar):");
            n = teclado.nextInt(); 
        }
        r = (float)acum_calf/cuenta;
        System.out.println("Promedio = "+r);
        teclado.close();
    }
    
}
package bono;

import java.util.Scanner;
public class Bono {
    public void bono(){
        Scanner teclado = new Scanner(System.in);
        double importe_bonificacion, importe_venta;
        System.out.print("Proporciona Ventas del Mes:");
        importe_venta = teclado.nextDouble();
       
        if(importe_venta>20000){
            importe_bonificacion = importe_venta * 8 /100;
        }else if(importe_venta>5000){
            importe_bonificacion = importe_venta * 5/100;
        }else if(importe_venta>1000){
            importe_bonificacion = importe_venta * 3/100;
        }else{
            importe_bonificacion = 0;
        }
        System.out.println("Bonificacion = $"+importe_bonificacion);
        teclado.close();
       

    }
    
}
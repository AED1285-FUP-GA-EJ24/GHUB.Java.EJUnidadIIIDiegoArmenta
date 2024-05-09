package calorias;
import java.util.Scanner;
public class Calorias {
    public void calorias(){
        Scanner entrada = new Scanner(System.in);
        
	    int calorias_total =0 ;
	    int cuenta=1; 
	   
        System.out.print("¿cuántos alimentos has consumido hoy?");
        int num_de_alementos= entrada.nextInt();
        

        while(cuenta<=num_de_alementos){
            System.out.print("Proporciona las calorias del alimento:"+
              cuenta+" que has consumido hoy:");
            int calorias_por_alimento = entrada.nextInt();
            calorias_total += calorias_por_alimento;
            cuenta++;
        }
        System.out.println("Total de calorias consumidas el día:"+calorias_total);
        entrada.close();
    }
    
}
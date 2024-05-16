package menorde3;

import java.util.Scanner;
public class Menorde3 {
    public void menorde3(){
        //declaracion del objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //variable de entrada
        int num;
        System.out.print("Proporciona un número entero:");
        num=entrada.nextInt();
        if (num<3){
            System.out.println("Menor de 3!");
        }
        else if(num==3){
            System.out.println("Igual a 3");
        }
        else{
            System.out.println("Mayor que 3!");
        }
   
        entrada.close();


    }
    
}
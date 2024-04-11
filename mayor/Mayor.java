package mayor;
import java.util.Scanner;
public class Mayor{
    public void mayor(){
        Scanner teclado = new Scanner(System.in);

        int a,b,c ;
        System.out.println("Proporciona los valor de a,b y c:");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("El mayor es: " + a);
            }
            else{
                System.out.println("El mayor es: "+ c);
            }
        }else{
            if(b>c){
                System.out.println("El mayor es: "+ b);
            }else{
                System.out.println("El mayor es: "+ c);
            }
        }
    teclado.close();

    }

}
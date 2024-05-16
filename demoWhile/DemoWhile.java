package demoWhile;

public class DemoWhile {
    public void demoWhile(){
        int i=0;
        while(i<10){
            System.out.println("Hola");
            i++;

        }
        System.out.println("Sali del ciclo while");
        final int N = 3;
        i=1; //inicio
        while (i<=N){
            System.out.println("Hola");
            i++;
        }
        System.out.println("Sali del ciclo while");
        //imprima del 0 al 9
        int x=0;//inicio
        while(x<10)
           System.out.println("X: "+ x++);

        System.out.println("Fin del bucle");
        x=0;
        while(x<10){
           System.out.println("X: "+ x);
           x++;
        }
        System.out.println("Fin del bucle");

        //El siguiente código es una ciclo vacio
        //porque nunca entra al while

        x=10;
        while(x<10){
           System.out.println("X: "+ x);
           x++;
        }

        int contador = 100;
        while (contador >0){
           System.out.println(contador);
           contador--;
        }

    }
    
}
package demoFor;

public class DemoFor {
    public void demofor(){
        //Defino variable de control
        int i;
        System.out.println("Ejemplos de ciclos Ascendentes:");
        //ciclo con incrementos de 1
        for(i=1;i<=10;i++){// i = i+1
            System.out.print("i="+i+" Hola"+"\n");

        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        //ciclos con incremento de 2
        for(i=1;i<=10;i += 2){//i = i+2;
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        System.out.println("Ejemplos de ciclos Descendentes:");
        for(i=10;i>0;i--){ // i = i-1
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        for(i=10;i>0;i-=2){ // i=i-2
            System.out.print("i="+i+" Hola"+"\n");
        }
        short j;
        for(j=0;j<100;j+=20){
            System.out.println("\t"+j+"\t"+j*j);

        }
        System.out.println("El valor final de j= "+j);
        for(short n=0;n<100;n+=20){
            System.out.println("\t"+n+"\t"+n*n);
        }


        for(int n=0;n<100;n+=20){
            System.out.println("\t"+n+"\t"+n*n);
        }
        for(int c='A';c<='Z';c++){
            System.out.print(c+" ");
        }
        System.out.println();
        for(int c='A';c<='Z';c++){
            System.out.print((char)(c)+" ");
        }
        System.out.println();

        int m= 12;
        for(int z=1;z<m;z++){
            System.out.println("Valor de z ="+z);
        }
        
        


    }
    
}
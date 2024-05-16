package demoDoWhile;

public class DemoDoWhile {
    public void demoDoWhile(){
        System.out.println("Demostracion de un ciclo ascendente utilizando for");
        for(int i=0;i<=3;i++){
            System.out.println("valor de i="+i);
            
            
        }
        System.out.println("Demostracion de un ciclo ascendente utilizando while");
        int i=0;
        while(i<=3){
            System.out.println("valor de i = "+i);
            i = i +1;
        }

        
        System.out.println("Demostracion de un ciclo ascendente utilizando do..while");
        i=0;
        do{
            System.out.println("valor de i="+i);
            i++;

        }while (i<=3);

    }
    
}
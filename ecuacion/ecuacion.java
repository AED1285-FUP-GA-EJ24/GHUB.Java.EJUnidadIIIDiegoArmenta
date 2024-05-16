package ecuacion;

public class Ecuacion {
    public void ecuacion(){
        
        int y;
       
        int x=1;
        System.out.println("Utilizando while");
        while (x<=10){
            y = x +12;
            System.out.print("x = "+x);
            System.out.println(" y = "+y);
            x++;
        }
        System.out.println("Utilizando for");
        for(x=1;x<=10;x++){
            y = x +12;
            System.out.print("x = "+x);
            System.out.println(" y = "+y);
        }

    }
    
}
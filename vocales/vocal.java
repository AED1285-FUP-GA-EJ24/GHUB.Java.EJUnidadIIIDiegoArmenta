package vocales;

import java.util.Scanner;

public class vocal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una vocal");
        char vocal = teclado.next().charAt(0);

        switch (vocal) {
            case 'a':
                System.out.println("1");
                break;
            case 'e':
                System.out.println("2");
                break;
            case 'i':
                System.out.println("3");
                break;
            case 'o':
                System.out.println("4");
                break;
            case 'u':
                System.out.println("5");
                break;
            default:
                System.out.println("No es una vocal valida");
        }
        teclado.close(); 
    }
}
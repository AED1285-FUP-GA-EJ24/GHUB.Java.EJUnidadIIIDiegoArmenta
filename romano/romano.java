package romano;

import java.util.Scanner;

public class romano {
    public void romanoconver() {
        Scanner teclado = new Scanner(System.in);

        String roma;
        short ara;

        System.out.println("Proporciona numero arabigo (1-10)");
        ara = teclado.nextShort();

        switch (ara) {
            case 1:
                roma = "I";
                break;
            case 2:
                roma = "II";
                break;
            case 3:
                roma = "III";
                break;
            case 4:
                roma = "IV";
                break;
            case 5:
                roma = "V";
                break;
            case 6:
                roma = "VI";
                break;
            case 7:
                roma = "VII";
                break;
            case 8:
                roma = "VIII";
                break;
            case 9:
                roma = "IX";
                break;
            case 10:
                roma = "X";
                break;
            default:
                roma = "Numero invalido";
        }
        System.out.println("El numero romano es: " + roma);

        teclado.close();
    }
}
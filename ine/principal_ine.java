package ine;
import java.util.Scanner;
public class principal_ine{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        Ine objIne = new Ine();
        objIne.determinarSiIne(teclado);
    }
}
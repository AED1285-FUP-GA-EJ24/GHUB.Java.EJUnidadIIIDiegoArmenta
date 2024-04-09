import java.util.Scanner;

public class difhermanos_prin{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ComparadorEdades comparador = new ComparadorEdades();
        comparador.difhermanos(teclado);
    }
}
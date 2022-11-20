import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notaDez;
        System.out.println("Digita um número ?");
        notaDez = teclado.nextInt();

        if ( notaDez == 10 ) {
            System.out.println("Parabéns ! ");
        }

        else {
            System.out.println(" Digite outro número!  ");
            while ( notaDez != 10 ) {
            notaDez = teclado.nextInt();
            System.out.println(" Digite outro número!  ");
        }

        }
        teclado.close();
        System.out.println( " É o que pensamos de você, sempre nota 10, obrigado por usar nosso sistema! ");
    }
}
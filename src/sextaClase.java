
package operadores;
import java.util.Scanner;
public class sextaClase {
    public static void main( String[] args){
        /*
        int x =5;
        x += 4;
        System.out.println("El resultado es: "+x);


        int y= 8;
         y++;
        System.out.println("El numero es: "+y);

        int c=5;
        c--;
        System.out.println("EL nuemero es: "+c);

         */

        double raiz= Math.sqrt(9); //para valores decimales
        int raiz1= (int)Math.sqrt(9); //para sacar raices exactas toca transformar a entero

        System.out.println("La raiz es: "+raiz);
        System.out.println("La raiz es: "+raiz1);


        double base=5,exponente=2;
        double resultado= Math.pow(base,exponente);
        System.out.println("el resultsdo es: "+resultado);

        double numero= 5.56;
        long resul = Math.round(numero);
        System.out.println("El: "+resul);

        double numero1= Math.random();
        System.out.println("El nuero random es: "+numero1);







        




    }
}

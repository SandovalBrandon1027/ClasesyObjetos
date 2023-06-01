import java.util.Scanner;
public class quitaClase {
    public static void main(String[] args){

        Scanner entrada  = new Scanner(System.in);

        float numero1, numero2, suma,resta,multi,division,resto;

        System.out.println("Diguite 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1%numero2;

        System.out.println("la suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+division);
        System.out.println("El resto es: "+resto);











    }
}

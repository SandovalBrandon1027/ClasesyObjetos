import java.util.Scanner;

import java.util.Scanner;
public class terceraClase {
    public static void main( String[] args){
        /*
        int numero=12;
        numero = 16;

        System.out.println("El numero es: "+numero);

        final int numero1=20; //Esta es una constante no se puede cambiar durante todo el programa

        System.out.println("El numero es: "+numero1);

         */

        Scanner entrada = new Scanner(System.in);
        /*

        int numero;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        System.out.println("El numero es: "+numero);



        float numero1;
        System.out.println("Ingrese un numero decimal: ");
        numero1 = entrada.nextFloat();

        System.out.println("El numero decimal es: "+numero1);


        String cadena;
        System.out.println("Digite una cadena: ");
        cadena = entrada.next();
        System.out.println("La cadena es: "+ cadena);


         */

        String cadena1;
        System.out.println("Digite una cadena: ");
        cadena1 = entrada.nextLine();
        System.out.println("La cadena es: "+ cadena1);

        char letra;
        System.out.println("Ingrese un caracter: ");
        letra = entrada.next().charAt(0);
        System.out.println("Su caracter es: "+letra);



















    }
}

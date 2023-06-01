import java.util.Scanner;
public class septimaClase {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*
        double num1,num2,num3,suma;
        System.out.println("Ingrese 3 calificaiones: ");
        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();
        num3 = entrada.nextDouble();

        suma= num1 + num2 + num3;

        System.out.println("El resultado de la suma es: "+suma);

         */
        int horas;
        double pagohoras = 20,salario;
        System.out.println("Ingrese el numeo de horas trabajadas: ");
        horas = entrada.nextInt();
        salario = horas * pagohoras;

        System.out.println("Su salario por semana es: "+salario);














    }
}

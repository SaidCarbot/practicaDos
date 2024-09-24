import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String notacion = "R\u00B2";
        System.out.printf("Esté programa calcula los pagos a trabajadores, \ndescribe en que cuadrante está un punto en " + notacion + " y encuentre la potencia de 2 más próxima (y menor) al número.\n");
        System.out.printf("\nSon usadas tres clases diferentes, una para cada problema\n");
        System.out.printf(colors.AZUL+ "\nPrimero serán calculados los pagos.\n" + colors.RESET);

        //////////////////////////////////////////////////////
        // I) Calcular el pago de un empleado basado en las horas que trabajó.
        // I.1 ) Ingreso de los datos de pagos
        int horas = 0;
        int sueldoPorHora = 0;
        while (true)
        {
            System.out.printf(colors.AZUL + "Por favor ingresa el total de horas trabajadas en un mes:"+ colors.RESET);
            horas = scanner.nextInt();
            // Bucle para que meta los datos correctos
            if(horas < 1 || horas > 672)
            {
                System.out.printf(colors.AZUL + "El número de horas validas trabajadas en un mes es entre 1 y 672\n"+ colors.RESET);
                continue;
            }
            System.out.printf(colors.AZUL + "Por favor ingresa el sueldo por hora:"+ colors.RESET);
            sueldoPorHora = scanner.nextInt(); // se vale usar contracciones scanner == sc pero no me deja
            break;// me cuesta aun el break y continue
        }
        // I.2) Del cálculo del pago
        pagos pagosTrabajador = new pagos(horas,sueldoPorHora);
        pagosTrabajador.calcularPago();

        ///////////////////////////////////////////////////
        // De la seccion del ejercicio II.
        System.out.printf(colors.VERDE+ "\nSegundo, serán descrito el cuadrante en donde está un punto en el plano "+ notacion + "\n"+ colors.RESET);
        // II.1) Ingreso del punto
        System.out.printf(colors.VERDE + "Por favor ingresa la coordenada x: "+ colors.RESET);
        int x = scanner.nextInt();
        System.out.printf(colors.VERDE + "Por favor ingresa la coordenada y: "+ colors.RESET);
        int y = scanner.nextInt();
        // II.2)Análisis del caso
        Puntos punto = new Puntos(x,y);

        /////////////////////////////////////////////
        // Instrucciones: 3. Crea un programa que tome un número positivo
        // y encuentre la potencia de 2 más próxima (y menor) al número.
        System.out.printf(colors.MORADO+ "\nTercero, serán mencionado la cota superior de la potencia 2^k que sea la más cercana a n, pero menor a n\n"+ colors.RESET);
        // III.1) Ingreso del valor n
        System.out.printf(colors.MORADO + "Por favor ingresa un número n: "+ colors.RESET);
        int n = scanner.nextInt();
        potencias potencias = new potencias(n);
        // III.2) Calculo de la potencia
        int exponenteCercano = potencias.encontrarExponente();
        System.out.println(colors.MORADO + "El exponente k tal que 2^k es el más cercano, pero menor que "+ n + " es: " + exponenteCercano + colors.RESET);

        // De cerrar la parte se seguir escaneando
        scanner.close();
    }
}

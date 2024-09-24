// Clase Pagos que realiza el cálculo del pago de un empleado
public class pagos
{
    // Definir las variables de entrada
    private int horas;
    private int pago;

    // Constructor que asigna los valores de horas y pago
    public pagos(int horas, int pago)
    {
        this.horas = horas;
        this.pago = pago;
    }

    //Metodo para calcular el pago total
    public void calcularPago()
    {
        // Definir las variables para el cálculo
        int pagoNormal = 0;
        int tiempoExtra = 0;
        int pagoTiempoExtra = 0;
        int pagoTotal = 0;

        // Condiciones de cálculo
        if (horas > 40)
        {
            tiempoExtra = horas - 40;
            pagoTiempoExtra = (int) (tiempoExtra * (pago * 1.5));// necesitaba un cast para que fuera entero y concordara con el tipo de dato
            pagoNormal = 40 * pago;
        }
        else
        {
            pagoNormal = horas * pago;
        }
        // Calcular el pago total
        pagoTotal = pagoNormal + pagoTiempoExtra;

        // Imprimir los resultados
        System.out.println(colors.AZUL+ "Pago normal por 40 horas o menos: " + pagoNormal + colors.RESET);
        System.out.println(colors.AZUL + "Tiempo extra trabajado: " + tiempoExtra + colors.RESET);
        System.out.println(colors.AZUL + "Pago por tiempo extra al 150% : " + pagoTiempoExtra + colors.RESET);
        System.out.println(colors.AZUL + "Pago total: " + pagoTotal + colors.RESET);
    }
}

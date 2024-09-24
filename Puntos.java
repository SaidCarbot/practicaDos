// Instrucciones: 2. Crea un programa que reciba como parámetro un punto con coordenadas
// (x,y) que indique en qué cuadrantes del plano cartesiano en 2D se encuentra.
public class Puntos
{
    // Definir las variables de entrada
    private int x;
    private int y;

    // De jalar las variables desde el main a la clase
    public Puntos(int x, int y)
    {
        this.x = x;
        this.y = y;
        // Llamar al método que determina el cuadrante
        determinarCuadrante();
    }

    // Método para analizar en qué cuadrante está el punto
    private void determinarCuadrante()
    {
        if (x > 0 && y > 0)
        {
            System.out.println(colors.VERDE + "El punto (" + x + ", " + y + ") está en el Primer Cuadrante." + colors.RESET);
        }
        else if (x < 0 && y > 0)
        {
            System.out.println(colors.VERDE + "El punto (" + x + ", " + y + ") está en el Segundo Cuadrante." + colors.RESET);
        }
        else if (x < 0 && y < 0)
        {
            System.out.println(colors.VERDE + "El punto (" + x + ", " + y + ") está en el Tercer Cuadrante." + colors.RESET);
        }
        else if (x > 0 && y < 0)
        {
            System.out.println(colors.VERDE + "El punto (" + x + ", " + y + ") está en el Cuarto Cuadrante." + colors.RESET);
        }
        else if (x == 0 && y != 0)
        {
            System.out.println(colors.VERDE + "El punto (" + x + ", " + y + ") está en el eje Y." + colors.RESET);
        }
        else if (y == 0 && x != 0)
        {
            System.out.println(colors.VERDE + "El punto (" + x + ", " + y + ") está en el eje X." + colors.RESET);
        }
        else
        {
            System.out.println(colors.VERDE + "El punto está en el origen." + colors.RESET);
        }
    }
}

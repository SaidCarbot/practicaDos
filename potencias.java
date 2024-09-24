public class potencias {
    // Definir las variables de entrada
    private int n;// valor buscado menor a potencia 2^k

    public potencias(int n) {
        this.n = n;
    }

    public int encontrarExponente()// me hacia falt aponer el publci int
    {
        for (int i = 0; ; i++)//Al infinito
        {
            int valorPotenciaDeDos = (int) Math.pow(2, i);
            if (valorPotenciaDeDos > n )
                return i - 1;
        }
    }
}


package PP1;

public class Inverso {
    
    public static void main(String[] args) {
        // Validar que se pase un argumento
        if (args.length != 1) {
            System.out.println("Uso: java Inverso <numero>");
            return;
        }

        // Convertir el argumento a número entero
        int numero = Integer.parseInt(args[0]);

        // Obtener el inverso usando recursividad
        int inverso = invertir(numero, 0);

        // Imprimir resultado
        System.out.println(numero + " → " + inverso);
    }

    /**
     * Método recursivo para invertir un número.
     * @param n número original
     * @param acumulado construcción del número inverso
     * @return inverso del número
     */
    public static int invertir(int n, int acumulado) {
        // Caso base: ya no quedan dígitos
        if (n == 0) {
            return acumulado;
        }
        // Extraer último dígito con residuo
        int digito = n % 10;
        // Construir el inverso multiplicando el acumulado por 10 y sumando el dígito
        return invertir(n / 10, acumulado * 10 + digito);
    }
}


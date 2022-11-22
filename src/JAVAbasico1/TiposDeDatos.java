package JAVAbasico1;

public class TiposDeDatos {

    public static void main(String[] args) {

        // 1. numericos enteros
        byte number1 = 1;
        short number2 = 10;
        int number3 = 30;
        long number4 = 100;

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);

        // 2. numericos decimales
        float decimal1 = 1.5f;
        double decimal2 = 32.4d;

        System.out.println(decimal1 + " " + decimal2);

        // 3. booleanos
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(verdadero + " " + falso);

        // 4. caracter
        char caracter1 = 'a';

        System.out.println(caracter1);

        // 5. cadenas de texto
        String nombre = "Sonia";

        System.out.println(nombre);
    }
}

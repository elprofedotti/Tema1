package ar.fusion;

import java.util.Optional;

public class Tema1 {
    public static void main(String[] args) {
        //TIPO DE DATOS
        // 1. numericos
            // 1.1 enteros
        byte numByte = 5;
        short numShort = 10;
        int numInt = 30;
        long numLong = 100;

            // 1.2 decimales
        float numFloat = 5.5f;
        double numDouble = 10.5d;

        // 2. booleano
        boolean estadoBoolean = false;

        // 3. texto
        char textoChar = 'a';
        String textoString = "Esto es una cadena de texto, o sea un string...";

        System.out.println("A continuacin muestro el contenido de las variables creadas");
        System.out.println("Tipo de datos NUMERICOS ENTEROS");
        System.out.println("numByte contiene: " +numByte+"-> variable tipo: Byte");
        System.out.println("numShort  contiene: "+numShort+"-> variable tipo: short");
        System.out.println("numInt  contiene: "+numInt+"-> variable tipo: int");
        System.out.println("numLong  contiene: "+numLong+"-> variable tipo: long");
        System.out.println("-------------");
        System.out.println("Tipo de datos NUMERICOS DECIMALES");
        System.out.println("numFloat  contiene: "+numFloat+"-> variable tipo: float");
        System.out.println("numDouble  contiene: "+numDouble+"-> variable tipo: double");
        System.out.println("-------------");
        System.out.println("Tipo de datos BOOLEANO");
        System.out.println("estadoBoolean es: "+estadoBoolean+"-> variable tipo: boolean");
        System.out.println("-------------");
        System.out.println("Tipo de datos TEXTO");
        System.out.println("textoChar  contiene: "+textoChar+"-> variable tipo: char");
        System.out.println("textoString  contiene: "+textoString+"-> variable tipo: String");
    }
}

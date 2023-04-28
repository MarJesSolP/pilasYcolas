package es.hiperdino.utilidades;

import java.util.Random;

public class generadorRandom {
    public static String productosAleatorios(){
        final String [] PRODUCTOS = { "Atún Bonito", "Vieja", "Aceite Masiasol","YoPro","ColaCao","Tinto de Verano Don Simon","Bezoya","Nestea Mango Piña","Coca Cola Zero","Lactovit","Munchitos","Queso de Valsequillo"
        };
        Random random = new Random();
        int indexAleatorio = random.nextInt(PRODUCTOS.length);
        return PRODUCTOS[indexAleatorio];
    }



}

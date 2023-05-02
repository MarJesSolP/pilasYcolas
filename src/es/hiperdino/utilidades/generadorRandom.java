package es.hiperdino.utilidades;

import java.util.Random;

public class generadorRandom {
    private static final String [] PRODUCTOS = { "Atún Bonito", "Vieja", "Aceite Masiasol","YoPro","ColaCao","Tinto de Verano Don Simon","Bezoya","Nestea Mango Piña","Coca Cola Zero","Lactovit","Munchitos","Queso de Valsequillo"
    };
    private static final String [] NOMBRES = {"Naira", "Magec", "Idaira", "Yeray", "Yurena", "Txenery", "Idaira", "Airam", "Ayoze", "Nauzet", "Fayna", "Gara", "Ancor", "Bentor", "Iballa", "Ico", "Isora", "Aday", "Haridian", "Arai"};
    public static String productosAleatorios(){

        Random random = new Random();
        int indexAleatorio = random.nextInt(PRODUCTOS.length);
        return PRODUCTOS[indexAleatorio];
    }
    public static String nombreAleatorio(){
        Random random = new Random();
        int indexAleatorio = random.nextInt(NOMBRES.length);
        return NOMBRES[indexAleatorio];
    }

}

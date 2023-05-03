import es.hiperdino.entidades.Cliente;

import static es.hiperdino.utilidades.generadorRandom.nombreAleatorio;
import static es.hiperdino.utilidades.generadorRandom.productosAleatorios;

public class Main {
    public static void main(String[] args) {

        System.out.println(nombreAleatorio());
        System.out.println(productosAleatorios());
        Cliente cliente1 = new Cliente();
        cliente1.agregarProducto();
        cliente1.verCesta();


    }



}
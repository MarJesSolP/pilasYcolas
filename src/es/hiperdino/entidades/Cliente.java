package es.hiperdino.entidades;

import es.hiperdino.utilidades.generadorRandom;

import java.util.Stack;


public class Cliente {
    protected String nombre;
    Stack<String> cestaCompra = new Stack<>();

    public Cliente() {
        this.nombre = generadorRandom.nombreAleatorio();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto() {
        cestaCompra.push(generadorRandom.productosAleatorios());

    }

    public String verCesta() {
        return "Cesta de la compra de " + nombre + ":\n   " + cestaCompra.toString().replace(",", "\n  ").replace("]", "").replace("[", "");

    }

    @Override
    public String toString() {
        String msg;
        msg = "----------------------------—=== CLIENTES ===—-------------------------\n" +
                "* Nombre: " + nombre + " \n" +
                "* Total de productos: " + cestaCompra.size() + "\n" +
                "* " + verCesta() + "\n" +
                "=========================================================================";
        return msg;
    }


}

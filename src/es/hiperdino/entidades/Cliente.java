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

    public void agregarProducto (){
        cestaCompra.push(generadorRandom.productosAleatorios());
    }
    public void quitarProducto(String producto){
        cestaCompra.remove(producto);
    }
     public void verCesta(){
         System.out.println("Cesta de la compra de " + nombre + ":" + cestaCompra);

     }

}

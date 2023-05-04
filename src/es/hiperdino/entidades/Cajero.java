package es.hiperdino.entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private int numeroCaja, identificadorDeCaja;
    private boolean abrirCaja = false;

    Queue <String> nombreClientesFilaDeCaja = new LinkedList<>();
    public boolean getAbrirCaja() {
        return abrirCaja;
    }
    public void abrirCaja(){
        if(abrirCaja == true){
            System.out.println("Shiquilla ya está abierta");
        }else {
            abrirCaja = true;
            System.out.println("Caja abierta");
        }
    }
    public void cerrarCaja(){
        if(!abrirCaja){
            System.out.println("La caja ya está cerrada MOSTRO");
        }else {
            System.out.println("Cerrando la cajita...");
            abrirCaja = false;
        }
    }
    public void agregarNombresClientes(String nombre){
        nombreClientesFilaDeCaja.add(nombre);
    }
    public void verClienteFila(){
        System.out.println("Los clientes en fila " + nombreClientesFilaDeCaja);
    }



}

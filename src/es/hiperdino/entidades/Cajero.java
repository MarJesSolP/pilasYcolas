package es.hiperdino.entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private int numeroCaja = 1;
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
    public String verClienteFila(){
        return "Los clientes en fila " + nombreClientesFilaDeCaja.toString().replace(",","\n  ").replace("]","").replace("[","");
    }

    @Override
    public String toString() {
        String msg;
        msg = "----------------------------—=== FILA CLIENTES ===—-------------------------\n" +
                "* Numero de caja: " + numeroCaja + " \n" +
                "* Total de cliente: " + nombreClientesFilaDeCaja.size() + " \n" +
                "* " + verClienteFila() + " \n" +
                "=========================================================================";
        return msg;
    }






}

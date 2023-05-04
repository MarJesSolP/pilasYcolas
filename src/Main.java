import es.hiperdino.entidades.Cajero;
import es.hiperdino.entidades.Cliente;

import java.util.Random;
import java.util.Scanner;

import static es.hiperdino.utilidades.generadorRandom.nombreAleatorio;
import static es.hiperdino.utilidades.generadorRandom.productosAleatorios;

public class Main {
    public static void main(String[] args) {
        Cajero Paquito = new Cajero();
        int opcion = 7, cantidadProductos;
        Scanner teclado = new Scanner(System.in);
        Random cantidadAleatoriaProductos = new Random();
        while (opcion != 5) {
            System.out.println("Elija una opción");
            System.out.println("Opción 1: Abrir la caja");
            System.out.println("Opción 2: Añadir un nuevo cliente a la cola");
            System.out.println("Opción 3: Atender un cliente");
            System.out.println("Opción 4: Ver clientes pendientes");
            System.out.println("Opción 5: Cerrar supermercado");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    Paquito.abrirCaja();
                    break;

                case 2:
                    if (Paquito.getAbrirCaja()) {
                        Cliente nuevoCliente = new Cliente();
                        cantidadProductos = cantidadAleatoriaProductos.nextInt(30);
                        for (int i = 0; i < cantidadProductos; i++) {
                            nuevoCliente.agregarProducto();
                        }
                        Paquito.agregarNombresClientes(nuevoCliente.getNombre());
                    } else {
                        System.out.println("Paquito, abre la caja primero shiquillo");
                    }
                    break;

                case 3:
                    if (!Paquito.listaVacia()) {
                        Paquito.clienteAtendido();
                    } else {
                        System.out.println("No hay clientes atendidos");
                    }
                    break;

                case 4:
                    System.out.println(Paquito);
                    break;

                case 5:
                    Paquito.cerrarCaja();
                    System.out.println("****Supermercado cerrado****");


            }


        }
    }

}




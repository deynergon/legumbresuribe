package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //entradas del problema
        String nombreProducto;
        String nombreDistribuidor;
        double costoLote;
        double costoVentaPublico;
        double totalCompra;
        int   cantidadCompradaProducto;

        //proceso
        Scanner pedirDato=new Scanner(System.in);

        System.out.println("cual es el nombre del producto");
        nombreProducto=pedirDato.nextLine();
        System.out.println("cual es el nombre del distribuidor");
        nombreDistribuidor=pedirDato.nextLine();
        System.out.println("cual es el costo del lote");
        costoLote=pedirDato.nextDouble();
        System.out.println("cual es el costo de ventas al publico");
        costoVentaPublico=pedirDato.nextDouble();
        System.out.println("cual es la cantidad comprada de producto");
        cantidadCompradaProducto=pedirDato.nextInt();

        System.out.println("*********************");
        System.out.println("Resumen ingreso mercancia");
        System.out.println("lote que entra"+nombreProducto);
        System.out.println("costo total:$"+costoLote);
        System.out.println("Entregado por:"+nombreDistribuidor);
        System.out.println("*******************");

        System.out.println("\n+++++venta al detal++++++\n");
        costoVentaPublico=5000;

        System.out.println("Apreciado usuario,el costo unitario de"+nombreProducto+"es de:$"+costoVentaPublico);
        System.out.println("digita la cantidad de"+nombreProducto+"que quieres comprar");
        cantidadCompradaProducto=pedirDato.nextInt();

        //calculando el valor de una variable
        totalCompra=costoVentaPublico*cantidadCompradaProducto;

        System.out.println("el valor de su compra es de:$"+totalCompra);

    }
}
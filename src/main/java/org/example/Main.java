package org.example;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Restaurante tradicion antigua");
        System.out.println("******************************");

        System.out.println("Menu del dia:");
        String purpura="\u001B[35m";
        System.out.println(purpura+"1. entradas😁:");
        System.out.println("*** empanaditas de iglesia--->$18000");
        System.out.println("*** picada Antioqueña(choricitos,morcillitas,patacon--->$33000");
        System.out.println("*** arepa de mote con quesito--->$15000");
        System.out.println("*** salchipap Paisa (papa criolla,papa capira,chicharron ,salchicha ranchera ,queso)--->$35000");
        String amarillo="\u001B[33m";
        System.out.println(amarillo+"2.sobremesa 🥃:");
        System.out.println("***aguapanela con limon--->$6000");
        System.out.println("*** chocolate migao--->$12500");
        System.out.println("***shot de tapa roja --->$8000");
        System.out.println("*** shot de tapa azul--->$11000");
        System.out.println("*** shot de tapa verde-->$12000");
        System.out.println("*** coctel cucaracho--->$38500");
        System.out.println("*** coctel blodymary--->$40000");
        System.out.println("*** caverne savugnon-->850000");
        String ROJO="\u001B[31m";
        System.out.println (ROJO+"3.  platos fuertes🍗💪:");
        System.out.println("***  sancocho trifasico--->$48000");
        System.out.println("*** bandeja paisa --->$62000");
        System.out.println("***  mondongo de la abue--->$52000");
        System.out.println("*** sopa del obispo--->$40000");
        System.out.println("*** sopa de la juanfe--->$42000");
        System.out.println("4. postres");
        System.out.println("*** Arroz con leche--->$19500");
        System.out.println("*** brevas con arequipe y queso--->$20000");
        System.out.println("*** dulce vitoria--->$18000");

        // creando un ciclo para selecionar el pedido:

        Scanner leerteclado=new Scanner(System.in);
        Integer opcionMenu=0;
        while(opcionMenu !=5){
            System.out.println("digita una opcion:");
            opcionMenu=leerteclado.nextInt();


        }
    }
}
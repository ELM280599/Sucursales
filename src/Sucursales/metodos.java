package Sucursales;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Optional.of;
import java.util.Scanner;

public class metodos {

    int[][] matriz;
    int sucursal;

    int filas;
    Scanner entrada = new Scanner(System.in);

    //punto1
    public void MostrarMatriz() {

        System.out.println("Ingrese la cantidad de sucursales.");

        filas = entrada.nextInt();

        matriz = new int[filas][12];
        Matriz();

    }

    public void Matriz() {

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Ene \tFeb \tMar \tAbr \tMay \tJun \tJul \tAgo \tSep \tOct \tNov \tDic");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 5 + 1);

                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    System.out.print("\t");

                }

            }
            System.out.println("   \t | Sucursal " + (i + 1));
            System.out.println("------------------------------------------------------------------------------------------------------------");

        }

    }
    //punto 2

    public void TotalVentas() {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total = total + matriz[i][j];

            }
        }
        System.out.println("El total de ventas de la empresa es de: $" + total);

    }
    //punto 3

    public int VentasSucursal() {

        int ventas = 0;
        System.out.println("Ingrese la sucursal para ver sus ventas:");
        sucursal = entrada.nextInt();
        if (sucursal < filas && sucursal > 0) {

            for (int j = 0; j < matriz[sucursal].length; j++) {

                ventas = ventas + matriz[sucursal - 1][j];

            }
            System.out.println("Las ventas totales de la sucursal fueron de: $" + ventas);
        } else {
            System.out.println("La sucursal ingresada no se encuentra!");
        }

        return ventas;
    }
    //punto 4

    public int VentasMes() {
        int ventasmes = 0;
        int mes;
        System.out.println("Ingrese el mes para ver sus ventas:");
        mes = entrada.nextInt();
        if (mes > 0 && mes < 13) {
            for (int i = 0; i < matriz.length; i++) {
                ventasmes += matriz[i][mes - 1];
            }
            System.out.print("Las ventas del mes fueron de: $" + ventasmes);
        } else {
            System.out.println("El mes ingresado no es correcto!");
        }

        return ventasmes;

    }
    //punto 5

    public int SucursalMayor() {

        int suma = 0;
        int mayor = 0;
        int indice = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                suma = suma + matriz[i][j];

            }
            if (suma > mayor) {
                mayor = suma;
                indice = i + 1;

            }

        }

        System.out.print("La sucursal con mayor ingreso es:" + indice + " con:$" + mayor);
        return mayor;

    }
    //punto 6

    public int SucursalMenor() {
        int suma;
        int menor = 0;
        int indice = 0;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                suma = suma + matriz[i][j];
            }
            if (contador == 0) {
                menor = suma;
                contador++;

            }
            if (suma < menor) {
                menor = suma;
                indice = i + 1;

            }

        }

        System.out.print("La sucursal con menor ingreso es:" + indice + " con:$" + menor);
        return menor;
    }

    //punto 7
    public int MayorVentasMes() {
        int suma = 0;
        int mayor = 0;
        int indice = 0;

        for (int j = 0; j < 12; j++) {
            suma = 0;

            for (int i = 0; i < matriz.length; i++) {

                suma = suma + matriz[i][j];

            }
            if (suma > mayor) {
                mayor = suma;
                indice = j + 1;

            }

        }
        System.out.print("\nLa columna con mayor ingreso es:" + indice + " con:$" + mayor);

        return mayor;

    }

    //punto 8
    public int MenorVentasMes() {
        int suma = 0;
        int menor = 0;
        int indice = 0;
        int contador = 0;

        for (int j = 0; j < 12; j++) {
            suma = 0;

            for (int i = 0; i < matriz.length; i++) {

                suma = suma + matriz[i][j];

            }
            if (contador == 0) {
                menor = suma;
                contador++;

            }
            if (suma < menor) {
                menor = suma;
                indice = j + 1;

            }

        }
        System.out.print("\nLa columna con menor ingreso es:" + indice + " con:$" + menor);

        return menor;
    }

}

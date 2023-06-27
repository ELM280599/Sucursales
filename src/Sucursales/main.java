package Sucursales;

import java.util.Scanner;

public class main extends metodos {

    public static void main(String[] args) {

        Scanner entrada2 = new Scanner(System.in);
        metodos mt = new metodos();

        boolean salir = false;
        int opcion;

        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1.Mostrar Sucursales y meses: ");
            System.out.println("2.Total de ventas de la empresa: ");
            System.out.println("3.Total de ventas de una sucursal en todo el año: ");
            System.out.println("4.Total de ventas en un mes de todas las sucursales:  ");
            System.out.println("5.Sucursal que más vendió: ");
            System.out.println("6.Sucursal que menos vendió: ");
            System.out.println("7.Mes en que se vendió más : ");
            System.out.println("8.Mes en que se vendió menos: ");
            System.out.println("---------------------------------------------------------------------");

            System.out.println("0. Salir");
            System.out.println("Elije una opcion");

            opcion = entrada2.nextInt();

            switch (opcion) {
                case 1:
                    //Mostrar Sucursales y meses */
                    mt.MostrarMatriz();

                    break;
                case 2:
                    //Total de ventas de la empresa */
                    mt.TotalVentas();

                    break;
                case 3:
                    //Total de ventas de una sucursal en todo el año */
                    //Agregar  ingreso de sucursal para ver las ventas
                    

                    mt.VentasSucursal();

                    break;

                case 4:
                    //Total de ventas en un mes de todas las sucursales */
                    //Agregar  ingreso del mes para ver las ventas
                   
                    mt.VentasMes();

                    break;

                case 5:
                    // Sucursal que más vendió*/
                    mt.SucursalMayor();
                    break;

                case 6:
                    //Sucursal que menos vendió*/
                    mt.SucursalMenor();
                    break;

                case 7:
                    //Mes en que se vendió más/
                    mt.MayorVentasMes();

                    break;
                case 8:
                    //Mes en que se vendió menos/
                    mt.MenorVentasMes();
                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida.");

            }

        } while (!salir);

        entrada2.close();
        System.out.println("Bye");

    }
}

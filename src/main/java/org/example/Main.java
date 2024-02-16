package org.example;

import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer cantidadEntradaDeCangrejo=0;
        Integer cantidadEscalopes=0;
        Integer cantidadFileteFrancia=0;
        Integer cantidadCorvina=0;
        Integer cantidadCoctelMichelle=0;
        Integer cantidadJugos=0;



        String cedula;
        LocalDate fecha=LocalDate.now();
        String nombresCliente;

        String nombreEmpleado;
        String contrasenaEmpleado;
        String correoEmpleado;
        String nombreEmpleadoBD="admin";
        String contrasenaEmpleadoBD="admin123";
        String correoEmpleadoBD="admin@gmail.com";
        Integer totalSinPropina=0;

        Integer opcion;
        Scanner lea = new Scanner(System.in);

        System.out.println("****Groseria By Rigo****");
        System.out.println("************************");
        System.out.println("Apreciado empleado, inicie sesión por favor: ");
        boolean loginExitoso = false;
        int intentosFallidos=0;


        while (intentosFallidos<3 ) {

            System.out.print("Digite su usuario: ");
            nombreEmpleado = lea.nextLine();
            System.out.println("Digite su correo: ");
            correoEmpleado = lea.nextLine();
            System.out.print("Digite su contraseña: ");
            contrasenaEmpleado = lea.nextLine();
            //login
            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)) {
                System.out.println("Cargando sistema.....");
                loginExitoso= true;
                System.out.println("1. Ingresar orden ");
                System.out.println("2. total de la compra");
                System.out.println("3. Terminar orden ");
                System.out.println("4. salir");
                do{
                    System.out.print("Selecciones una opcion: ");
                    opcion=lea.nextInt();


                    Integer productoSeleccionado;
                    switch(opcion){
                        case 1:
                            System.out.println("1. Entrada de cangrejo de urrao ($28.000)");
                            System.out.println("2. Escalopes a la rigo ($35.000)");
                            System.out.println("3. Filete tour de Francia ($150.000)");
                            System.out.println("4. Corvina de rigo ($80.000)");
                            System.out.println("5. Coctel michelle ($20.000");
                            System.out.println("6. Jugos de urrao (18.500)");
                            System.out.println("7. Terminar pedido");
                            System.out.println(".................................");

                            do{
                                System.out.print("Digite producto deseado: ");
                                productoSeleccionado=lea.nextInt();
                                switch (productoSeleccionado){
                                    case 1:
                                        System.out.print("Digita cuantos entradas se desean: ");
                                        cantidadEntradaDeCangrejo=lea.nextInt();
                                        break;
                                    case 2:
                                        System.out.print("Digita cantidad escalopes deseada: ");
                                        cantidadEscalopes= lea.nextInt();
                                        break;
                                    case 3:
                                        System.out.print("Digita cantidad Filete Francia: ");
                                        cantidadFileteFrancia=lea.nextInt();
                                        break;
                                    case 4:
                                        System.out.print("Digita cantidad Carvina: ");
                                        cantidadCorvina=lea.nextInt();
                                        break;
                                    case 5:
                                        System.out.print("Digita cantidad de Cocteles: ");
                                        cantidadCoctelMichelle=lea.nextInt();
                                        break;
                                    case 6:
                                        System.out.println("Digita cantidad de jugos: ");
                                        cantidadJugos=lea.nextInt();
                                    case 7:
                                        System.out.println("orden terminada");
                                        break;
                                    default:
                                        System.out.println("Producto no encontrado");
                                        break;

                                }
                            }while(productoSeleccionado!=7);

                            break;
                        case 2:

                            totalSinPropina=((cantidadEntradaDeCangrejo*28000)
                                    +(cantidadEscalopes*35000)+
                                    (cantidadFileteFrancia*150000)+
                                    (cantidadCorvina*80000)+
                                    (cantidadCoctelMichelle*20000)+
                                    (cantidadJugos*18500));

                            System.out.printf("Este es el total de su compra: " + totalSinPropina);

                            Double totalConPropina=((totalSinPropina)+(totalSinPropina*0.1));
                            //Rutina para mostrar un mensaje con o sin propina

                            break;

                        case 3:
                            System.out.println("Compra terminada");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }


                }while(opcion !=4);
            } else {
                intentosFallidos++;
                System.out.println("Usuario incorrecto");
                System.out.println("numero intetos fallidos es " + intentosFallidos);

            }
        }


    }
}
package Excepcions.ActivitatExceptions;

import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;

import java.util.Scanner;

public class MainBanc {
    public static void main(String[] args) throws ClientAccountException, InterruptedException, BankAccountException {


        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        String option;

        do{
            System.out.println("\n¿Qué quieres hacer?\n");
            System.out.println("1.- Registrar cliente");
            System.out.println("2.- Ver listado de clientes");
            System.out.println("3.- Crear un usuario del banco");
            System.out.println("4.- Añadir usuario a cuenta bancaria");
            System.out.println("5.- Hacer una transferencia");

            System.out.println("\n0.- Salir del programa");

            option = input.nextLine();
            menu.showMenu(option);

            Thread.sleep(1000);

        }while (!option.equals("0"));

    }
}

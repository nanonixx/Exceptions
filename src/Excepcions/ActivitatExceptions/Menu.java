package Excepcions.ActivitatExceptions;

import Excepcions.ActivitatExceptions.Control.ControlClient;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;
import Excepcions.ActivitatExceptions.Model.Client;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    ControlClient controlClient = new ControlClient();
    Random random = new Random();

    public void showMenu(String menu) throws ClientAccountException {


        switch(menu){
            case "1":
                System.out.println("Nombre: ");
                String nom = input.nextLine();
                System.out.println("Apellido: ");
                String cognom = input.nextLine();
                System.out.println("DNI: ");
                String dni = input.nextLine();

                controlClient.addUser(nom, cognom, dni);
                break;

            case "2":
                for (Client c: controlClient.getClientList()) {
                    System.out.println(c.toString());
                }
                break;

            case "3":

                CompteEstalvi compteEstalvi = new CompteEstalvi(String.valueOf(Math.abs(random.nextInt())));

        }


    }


}

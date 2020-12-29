package Excepcions.ActivitatExceptions;

import Excepcions.ActivitatExceptions.Control.ControlClient;
import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;
import Excepcions.ActivitatExceptions.Model.Client;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    ControlClient controlClient = new ControlClient();
    OperacionsBanc operacionsBanc = new OperacionsBanc();
    Random random = new Random();

    public void showMenu(String menu) throws ClientAccountException, BankAccountException {


        switch(menu){
            case "1":
                System.out.println("Nombre: ");
                String nom = input.nextLine();
                System.out.println("Apellido: ");
                String cognom = input.nextLine();
                System.out.println("DNI: ");
                String dni = input.nextLine();

                //Client client = Client(nom, cognom, dni);

                controlClient.addClient(nom, cognom, dni);
                break;

            case "2":
                for (Client c: controlClient.getClientList()) {
                    System.out.println(c.toString());
                }
                break;

            case "3":
                System.out.println("DNI del cliente al que vincular la cuenta: ");
                String d = input.nextLine();

                break;

            case "4":

                System.out.println("Seleccionar cuenta:");

                for (int i = 0; i < operacionsBanc.getCompteEstalviList().size(); i++) {
                    System.out.println((i+1) + ": ");
                    System.out.print(operacionsBanc.getCompteEstalviList().get(i).toString());
                }
                int index = input.nextInt();

                System.out.println("DNI del cliente al que vincular la cuenta: ");
                String dNI = input.nextLine();

                operacionsBanc.addUserToBankAccount(index, dNI);

                break;

            case "5":
                System.out.println("Tu número de cuenta: ");
                String num1 = input.nextLine();
                System.out.println("Número de cuenta al que transferir: ");
                String num2 = input.nextLine();
                System.out.println("Cantidad de dinero a transferir: ");
                double q = input.nextDouble();

                operacionsBanc.transferir(num1, num2, q);
        }


    }


}

package Excepcions.ActivitatExceptions.Control;

import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ExceptionMessage;
import Excepcions.ActivitatExceptions.Model.Client;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;

import java.util.ArrayList;
import java.util.List;

public class OperacionsBanc {

    List<CompteEstalvi> compteEstalviList = new ArrayList<>();

    public static boolean verifyDNI(String dni) throws ClientAccountException {
        if (dni.length() != 9 ) {
            throw new ClientAccountException(ExceptionMessage.WRONG_DNI);
        }
        return true;
    }

    public static boolean verifyBankAccount(String numCompte) throws BankAccountException {
            try {
                 //si el numerico se corresponde con un cuenta banco control comandas
            } catch (Exception e){
                throw new BankAccountException(ExceptionMessage.ACCOUNT_NOT_FOUND);
            }
            return true;
    }

    public void transferir(String numCompte1, String numCompte2, double quantitat) throws BankAccountException {
        if (verifyBankAccount(numCompte1) && verifyBankAccount(numCompte2)){

        }
    }

}

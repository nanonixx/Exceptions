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

    public boolean verifyBankAccount(String numCompte) throws BankAccountException {

              for (CompteEstalvi c : compteEstalviList) {
                  if (c.getNumCompte().equals(numCompte)) return true;
              }
              throw new BankAccountException(ExceptionMessage.ACCOUNT_NOT_FOUND);
    }


    public void transferir(String numCompte1, String numCompte2, double quantitat) throws BankAccountException {

        if (verifyBankAccount(numCompte1) && verifyBankAccount(numCompte2)){
            for (CompteEstalvi c : compteEstalviList) {
                if (c.getNumCompte().equals(numCompte1)) {
                    if (c.getSaldo() < quantitat) throw new BankAccountException(ExceptionMessage.ACCOUNT_OVERDRAFT);
                    //lo de arriba es el treure
                    else {
                        for (CompteEstalvi c2 : compteEstalviList) {
                            if (c2.getNumCompte().equals(numCompte2)) {
                                c.treure(quantitat);
                                c2.ingressar(quantitat);
                            }
                        }
                    } //TODO hacer las cosas como recs
                }
            }

        }
    }

}

package Excepcions.ActivitatExceptions.Control;

import Excepcions.ActivitatExceptions.Model.Client;

import java.util.ArrayList;
import java.util.List;

public class ControlClient {
    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    private List<Client> clientList = new ArrayList<Client>();

    public void addClient(String nom, String cognom, String dni){
        try {
            Client client = new Client(nom, cognom, dni);
            clientList.add(client);
        } catch (Exception e) {
            System.err.print(e);
        }

    }
}

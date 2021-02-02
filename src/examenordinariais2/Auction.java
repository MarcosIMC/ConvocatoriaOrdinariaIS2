package examenordinariais2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Auction implements Observer{
    private ArrayList<Object> actives;
    private Date timeToLife;
    private ArrayList<Object> olders;
    private int lastUserId;
    private ArrayList<Client> clientsSubscribe;

    public Auction(ArrayList<Object> actives, ArrayList<Object> olders) {
        this.actives = actives;
        this.olders = olders;
        clientsSubscribe = new ArrayList<>();
    }

    public ArrayList<Object> getActives() {
        return actives;
    }

    public void setActives(ArrayList<Object> actives) {
        this.actives = actives;
    }

    public Date getTimeToLife() {
        return timeToLife;
    }

    public void setTimeToLife(Date timeToLife) {
        this.timeToLife = timeToLife;
    }

    public ArrayList<Object> getOlders() {
        return olders;
    }

    public void setOlders(ArrayList<Object> olders) {
        this.olders = olders;
    }

    public int getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(int lastUserId) {
        this.lastUserId = lastUserId;
    }    

    @Override
    public void ClientsAuction(Object object, Client client) {
        clientsSubscribe.add(client);
        
    }

    @Override
    public void NotifyAll(Object object) {
        for (Client client : clientsSubscribe) {
            System.out.println("Querid@: "+client.getName() +"La apuesta del objeto: "+object.getDescription()+" fue incrementada a un valor actual de: "+object.getPrice());
        }
    }

    @Override
    public void RemoveClien(Client client, Object object) {
        System.out.println("El usuario "+ client.getName() + " abandona la apuesta por el objeto: "+object.getDescription()+ " el precio actual del mismo es: "+object.getPrice());
        clientsSubscribe.remove(client);
    }
    
}

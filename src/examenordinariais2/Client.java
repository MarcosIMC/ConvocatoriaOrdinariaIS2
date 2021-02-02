/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenordinariais2;

import java.util.ArrayList;

/**
 *
 * @author marke
 */
public class Client extends Person{
    ArrayList<Object> actualAuctions;
    int id;
    public Client(String name, String surname, int age, int id) {
        super(name, surname, age);
        this.id = id;
    }
    
    public boolean BidUp(Object object, int price, Auction auction){
        actualAuctions = new ArrayList<>();
        if (price > object.getPrice()){
            object.setPrice(price);
            actualAuctions.add(object);
            auction.setLastUserId(id);
            
            System.out.println("La puja se realizó correctamente.");
            return true;
        }
        System.out.println("No se pudo realizar la puja, el precio es inferior.");
        return false;        
    }
    
    public boolean Leave(int id, Auction auction){
        if(actualAuctions.get(id) != null){
            actualAuctions.remove(id);
            if (auction.getLastUserId() == this.id) auction.setLastUserId(0);
            System.out.println("Abandonaste la puja por el objeto.");
            return true;
        }
        System.out.println("No has realizado ninguna puja por ese objeto.");
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}

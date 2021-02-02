package examenordinariais2;

import java.util.ArrayList;

public class Main {   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Client client = new Client("usuario1", "de prueba", 27, 1);
        Client client2 = new Client("usuario2", "prueba", 30, 2);
        Client client3 = new Client("usuario3", "pruebita", 22, 3);
        Auction auction;
        
        auction = CreateObjects();
        
        System.out.println("Vemos las apuestas que están disponibles ahora mismo...");
        ArrayList<Object> actual = auction.getActives();
        for (Object object : actual) {
            System.out.println("ID: "+object.getId());
            System.out.println("Description: "+object.getDescription());
            System.out.println("Photo: "+object.getPhotos());
            System.out.println("Price: "+String.valueOf(object.getPrice()+"€"));
            System.out.println("---------------------------------------------");
        }
        
        System.out.println("El cliente: "+client.getName()+ " va a realizar una apuesta por el objeto: 0");
        if (client.BidUp(actual.get(0), 2001, auction)){
            auction.ClientsAuction(actual.get(0), client);
            auction.NotifyAll(actual.get(0));
            
            System.out.println("El precio actual del objeto con descripción: " +actual.get(0).getDescription() + " es: "+actual.get(0).getPrice()+"€");            
        }      
        
        System.out.println("El cliente: "+client2.getName()+ " va a realizar una apuesta por el objeto: 0");
        if (client2.BidUp(actual.get(0), 2050, auction)){
            auction.ClientsAuction(actual.get(0), client2);
            auction.NotifyAll(actual.get(0));
            
            System.out.println("El precio actual del objeto con descripción: " +actual.get(0).getDescription() + " es: "+actual.get(0).getPrice()+"€");            
        }

        System.out.println("El cliente: "+client3.getName()+ " va a realizar una apuesta por el objeto: 0");
        if (client3.BidUp(actual.get(0), 2200, auction)){
            auction.ClientsAuction(actual.get(0), client3);
            auction.NotifyAll(actual.get(0));
            
            System.out.println("El precio actual del objeto con descripción: " +actual.get(0).getDescription() + " es: "+actual.get(0).getPrice()+"€");            
        }

        System.out.println("El cliente: "+client.getName()+ " va a abandonar una apuesta por el objeto: 0");
        if (client.Leave(0, auction)){
            auction.RemoveClien(client, actual.get(0));
            //auction.NotifyAll(actual.get(0));
            
            System.out.println("El precio actual del objeto con descripción: " +actual.get(0).getDescription() + " es: "+actual.get(0).getPrice()+"€");            
        }        
    }
    
    private static Auction CreateObjects(){
        System.out.println("Creando los objetos de existentes en las apuestas...");

        Object object = new Object("Jarrón del siglo XVI", 2000, "Imagen1.jpg", 0, true);
        Object object2 = new Object("Cuadro italiano moderno", 50, "img.png", 1, true);
        Object object3 = new Object("Espada Romana", 1500, "Imagen1.jpg", 2, true);
        Object object4 = new Object("Escudo Romano", 2500, "Imagen2.jpg", 3, false);
        Object object5 = new Object("Moneda griega", 800, "Imagen.jpeg", 4, true);
        
        System.out.println("Añadiendo los objetos a las listas de pujas...");
        ArrayList<Object> objectsActives = new ArrayList<>();
        objectsActives.add(object);
        objectsActives.add(object2);
        objectsActives.add(object3);
        objectsActives.add(object5);
        
        ArrayList<Object> objectsOlders = new ArrayList<>();
        objectsOlders.add(object4);
        Auction auction = new Auction(objectsActives, objectsOlders);
        
        return auction;
    }     
}

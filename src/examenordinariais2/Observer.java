package examenordinariais2;
/**
 *
 * @author marke
 */
public interface Observer {
    public void ClientsAuction(Object object, Client client);
    public void NotifyAll(Object object);
    public void RemoveClien(Client client, Object object);
}

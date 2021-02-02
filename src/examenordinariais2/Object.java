package examenordinariais2;

public class Object {
    private String description;
    private double price;
    private String photos;
    private int id;
    private boolean active;

    public Object(String description, double price, String photos, int id, boolean active) {
        this.description = description;
        this.price = price;
        this.photos = photos;
        this.id = id;
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
}

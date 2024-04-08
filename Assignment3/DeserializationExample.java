import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    // Getters and setters if needed
}

public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(System.in)) {
            System.out.println("Enter serialized product object:");
            Product product = (Product) ois.readObject();
            System.out.println("Deserialized Product Object:");
            product.printDetails();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

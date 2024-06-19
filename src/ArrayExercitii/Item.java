package ArrayExercitii;

public class Item {

    private String name;
    private String type;
    private int quantity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }
}

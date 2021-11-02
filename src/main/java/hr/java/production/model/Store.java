package hr.java.production.model;

public class Store {

    String name, webAddress;
    Item[] items;

    public Store(String name, String webAddress, Item[] items) {
        this.name = name;
        this.webAddress = webAddress;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public Item[] getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}

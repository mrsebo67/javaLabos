package hr.java.production.model;

public class Factory extends NamedEntity {

    Address address;
    Item[] items;

    public Factory(String name, Address address, Item[] items) {
        super(name);
        this.address = address;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Item[] getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}

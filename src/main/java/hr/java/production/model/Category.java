package hr.java.production.model;

public class Category extends NamedEntity {


    String description;

    public Category(String name, String description){
        super(name);
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return this.getName() + ", " + this.getDescription();
    }
}

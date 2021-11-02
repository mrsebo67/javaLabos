package hr.java.production.main;

import hr.java.production.model.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static Category[] categories;
    static Item[] items = new Item[5];
    static Factory[] factories= new Factory[2];
    static Store[] stores = new Store[2];
    static Scanner input = new Scanner(System.in);
    static Address[] addresses = new Address[2];

    public static void main(String[] args) {


        addresses[0] = new Address("August Seona", "13", "Zapresic", "10290");
        addresses[1] = new Address("Ilica", "12", "Zagreb", "10000");

        setCategories();
        printCategories();
        setItems();
        printItems();
        setFactories();
        printFactories();
        //setStores();
        /*BigDecimal currentVolume = BigDecimal.ZERO;
        Factory currentFactory = factories[0];
        for(Factory f: factories){
            for(Item i: f.getItems()){
                if(i.getVolume().compareTo(currentVolume) > 0){
                    currentFactory = f;
                    currentVolume = i.getVolume();
                    break;
                }
            }
        }
        System.out.println(currentFactory.getName());

        Item[] tempItems = stores[0].getItems();
        BigDecimal currentPrice = tempItems[0].getSellingPrice();
        Store currentStore = stores[0];
        for(Store s: stores){
            for(Item i: s.getItems()){
                if(i.getSellingPrice().compareTo(currentPrice) < 0){
                    currentStore = s;
                    currentPrice = i.getSellingPrice();
                    break;
                }
            }
        }
        System.out.println(currentFactory.getName());
    */
    }

    public static void setCategories(){

        System.out.println("Input categories:");

        System.out.println("Input number of categories: ");
        int numberCategories = input.nextInt();
        input.nextLine();
        categories = new Category[numberCategories];

        for (int i = 0; i < numberCategories; i++){
            System.out.println("Next category");
            String name, description;
            System.out.print("-->Input name: ");
            name = input.nextLine();
            System.out.print("-->Input description: ");
            description = input.nextLine();
            categories[i] = new Category(name, description);


        }
    }

    public static void printCategories(){
        for(Category elem: categories){
            System.out.println(elem);
        }
    }



    public static void printItems(){
        for(Item i: items){
            System.out.println(i);
        }
    }

    public static void setItems(){

        System.out.println("Input items:");

        System.out.println("Input number of items: ");
        int numberItems = input.nextInt();
        input.nextLine();
        items = new Item[numberItems];


        for (int i = 0; i < numberItems; i++){
            System.out.println("Next Item");
            String name, category;
            BigDecimal width, height, length, productionCost, sellingPrice;
            System.out.print("-->Input name: ");
            name = input.nextLine();

            System.out.print("-->Input category: ");
            category = input.nextLine();
            Category tempCategory = categories[0];
            for(Category c: categories){
                if(c.getName().equals(category)){
                    tempCategory = c;
                }
            }

            System.out.print("-->Input width: ");
            width = input.nextBigDecimal();
            input.nextLine();

            System.out.print("-->Input height: ");
            height = input.nextBigDecimal();
            input.nextLine();

            System.out.print("-->Input length: ");
            length = input.nextBigDecimal();
            input.nextLine();

            System.out.print("-->Input production cost: ");
            productionCost = input.nextBigDecimal();
            input.nextLine();

            System.out.print("-->Input selling price: ");
            sellingPrice = input.nextBigDecimal();
            input.nextLine();

            items[i] = new Item(name, tempCategory, width, height, length, productionCost, sellingPrice);
            }
        }

    public static void setFactories(){

        System.out.println("Input factories:");

        System.out.println("Input number of factories: ");
        int numberFactories = input.nextInt();
        input.nextLine();

        for(int i = 0; i < numberFactories; i++){
            System.out.println("Next factory");

            String name;
            System.out.print("-->Input name: ");
            name = input.nextLine();
            Item[] tempItems = new Item[2];
            tempItems[0] = items[i%2];
            tempItems[1] = items[(i+1)%2];

            factories[i] = new Factory(name, addresses[i%2], tempItems);

        }

    }

    public static void printFactories(){
        for(Factory f: factories){
            System.out.println(f.getName());
        }
    }

    public static void setStores() {

        System.out.println("Input stores:");

        System.out.println("Input number of stores: ");
        int numberStores = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberStores; i++) {
            System.out.println("Next store");
            String name, webAddress;

            System.out.print("-->Input name:");
            name = input.nextLine();

            System.out.println("-->Input web address");
            webAddress =input.nextLine();

            Item[] tempItems = new Item[2];
            tempItems[0] = items[i%2];
            tempItems[1] = items[(i+1)%2];

            stores[i] = new Store(name, webAddress, tempItems);

        }
    }
}

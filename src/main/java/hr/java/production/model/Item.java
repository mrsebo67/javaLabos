package hr.java.production.model;

import java.math.BigDecimal;

public class Item {

    String name;
    Category category;
    BigDecimal width, height, length, productionCost, sellingPrice;

    public Item(String name, Category category, BigDecimal width, BigDecimal height, BigDecimal length, BigDecimal productionCost, BigDecimal sellingPrice) {
        this.name = name;
        this.category = category;
        this.width = width;
        this.height = height;
        this.length = length;
        this.productionCost = productionCost;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public BigDecimal getLength() {
        return length;
    }

    public BigDecimal getProductionCost() {
        return productionCost;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public void setProductionCost(BigDecimal productionCost) {
        this.productionCost = productionCost;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getVolume(){
        return this.height.multiply(this.length.multiply(this.width));
    }

    @Override
    public String toString(){
        return this.getName();
    }
}


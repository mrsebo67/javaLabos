package hr.java.production.model;

import java.math.BigDecimal;

public class Beverage extends Item implements Edible{

    final int kcalPerKg;
    BigDecimal weight;

    public Beverage(String name, Category category, BigDecimal width, BigDecimal height, BigDecimal length, BigDecimal productionCost, BigDecimal sellingPrice, int kcalPerKg,BigDecimal weight) {
        super(name, category, width, height, length, productionCost, sellingPrice);
        this.kcalPerKg = kcalPerKg;
        this.weight = weight;
    }


    @Override
    public int calculateCalories() {
        return weight.intValue()* kcalPerKg;
    }

    @Override
    public int calculatePrice() {
        return weight.intValue() * sellingPrice.intValue();
    }
}


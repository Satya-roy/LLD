package decorator_class;

import base_class.Pizza;

public class MushroomDecorator extends Pizza {
    private Pizza pizza;

    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}

package decorator_class;

import base_class.Pizza;

public class ExtraCheeseDecorator extends Pizza {
    Pizza pizza;

    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }
}

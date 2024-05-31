import base_class.Pizza;
import base_class.VeggiePizza;
import decorator_class.ExtraCheeseDecorator;
import decorator_class.MushroomDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new VeggiePizza();
        System.out.println("Cost of base pizza : " + basePizza.getCost());

        Pizza veggiePizzaWithExtraCheese = new ExtraCheeseDecorator(basePizza);
        System.out.println("Cost of base pizza with extra cheese: " + veggiePizzaWithExtraCheese.getCost());

        Pizza veggiePizzaWithExtraCheeseAndMushroom = new MushroomDecorator(new ExtraCheeseDecorator(basePizza));
        System.out.println("Cost of base pizza with extra cheese and mushroom: " + veggiePizzaWithExtraCheeseAndMushroom.getCost());
    }
}
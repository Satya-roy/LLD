package scoop;

import iceCreamBase.IceCream;

public class ChocolateScoop extends Scoop {
    IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int cost() {
        return iceCream.cost() + 35;
    }
}

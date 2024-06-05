package scoop;

import iceCreamBase.IceCream;

public class VanillaScoop extends Scoop{
    public IceCream iceCream;
    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int cost() {
        return iceCream.cost() + 45;
    }
}

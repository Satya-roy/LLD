package scoop;

import iceCreamBase.IceCream;

public class ButterScotchScoop extends Scoop{
    IceCream iceCream;
    public ButterScotchScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int cost() {
        return iceCream.cost() + 55;
    }
}

import iceCreamBase.ConeBase;
import iceCreamBase.IceCream;
import scoop.ButterScotchScoop;
import scoop.ChocolateScoop;
import scoop.VanillaScoop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IceCream vanilla_ButterScotch_ChocolateCream = new VanillaScoop(new ButterScotchScoop(new ChocolateScoop(new ConeBase())));
        System.out.println(vanilla_ButterScotch_ChocolateCream.cost()); // 35 + 45 + 55 + 30
    }
}
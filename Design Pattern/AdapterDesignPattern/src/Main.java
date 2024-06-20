import adaptee.WeightingMachineForBabies;
import adapter.WeightMachineAdapter;
import adapter.WeightMachineAdapterImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightingMachineForBabies());

        System.out.println("Weight in Kg : " + weightMachineAdapter.getWeightInKg());
    }
}
package adapter;

import adaptee.WeightingMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightingMachine weightingMachine;

    public WeightMachineAdapterImpl(WeightingMachine _weightingMachine) {
        this.weightingMachine = _weightingMachine;
    }

    @Override
    public double getWeightInKg() {
        return 0.45 * weightingMachine.getWeightInPounds();
    }
}

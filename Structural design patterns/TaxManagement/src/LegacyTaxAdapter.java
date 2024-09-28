// LegacyTaxAdapter.java
public class LegacyTaxAdapter implements TaxCalculator {
    private LegacyTaxSystem legacyTaxSystem;

    public LegacyTaxAdapter(LegacyTaxSystem legacyTaxSystem) {
        this.legacyTaxSystem = legacyTaxSystem;
    }

    @Override
    public double calculateTax(double amount) {
        return legacyTaxSystem.computeTax(amount); // Directly delegate to legacy system
    }
}

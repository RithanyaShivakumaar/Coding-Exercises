// Main.java
public class Main {
    public static void main(String[] args) {
        // Use the legacy tax system
        TaxCalculator legacyTaxCalculator = new LegacyTaxAdapter(new LegacyTaxSystem());
        double legacyTax = legacyTaxCalculator.calculateTax(1000.0);
        System.out.println("Legacy Tax Calculation: $" + legacyTax);

        // Use the modern tax API
        TaxCalculator modernTaxCalculator = new ModernTaxAdapter(new ModernTaxAPI());
        double modernTax = modernTaxCalculator.calculateTax(1000.0);
        System.out.println("Modern Tax Calculation: $" + modernTax);
    }
}

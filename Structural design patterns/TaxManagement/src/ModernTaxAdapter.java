// ModernTaxAdapter.java

public class ModernTaxAdapter implements TaxCalculator {
    private ModernTaxAPI modernTaxAPI;

    public ModernTaxAdapter(ModernTaxAPI modernTaxAPI) {
        this.modernTaxAPI = modernTaxAPI;
    }

    @Override
    public double calculateTax(double amount) {
        // Create a JSON-like request string
        String jsonRequest = "{\"amount\": " + amount + "}";
        
        // Get the JSON-like response from the modern tax API
        String jsonResponse = modernTaxAPI.getTaxAmount(jsonRequest);
        
        // Manually parse the JSON-like string to extract the tax amount
        String taxValue = jsonResponse.split(":")[1].replace("}", "").trim();
        
        // Convert the extracted value to a double and return it
        return Double.parseDouble(taxValue);
    }
}

// ModernTaxAPI.java
public class ModernTaxAPI {
    public String getTaxAmount(String jsonRequest) {
        // For the sake of this example, assume JSON input/output
        // {"amount": 1000.0} -> {"tax": 150.0} (15% tax)
        // In real life, this would be parsed from JSON, but for simplicity:
        return "{\"tax\": " + (Double.parseDouble(jsonRequest.split(":")[1].replace("}", "").trim()) * 0.15) + "}";
    }
}

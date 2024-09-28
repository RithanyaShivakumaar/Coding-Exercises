import java.util.List;

public class Sub {
    private final BreadType bread;
    private final List<FillingType> fillings;
    private final List<SauceType> sauces;
    private final boolean toasted;

    // Private constructor to prevent direct instantiation
    private Sub(BreadType bread, List<FillingType> fillings, List<SauceType> sauces, boolean toasted) {
        this.bread = bread;
        this.fillings = fillings;
        this.sauces = sauces;
        this.toasted = toasted;
    }

    // Getters for all properties
    public BreadType getBread() {
        return bread;
    }

    public List<FillingType> getFillings() {
        return fillings;
    }

    public List<SauceType> getSauces() {
        return sauces;
    }

    public boolean isToasted() {
        return toasted;
    }

    @Override
    public String toString() {
        return "Sub Sandwich [Bread: " + bread + ", Fillings: " + fillings + ", Sauces: " + sauces + ", Toasted: " + (toasted ? "Yes" : "No") + "]";
    }

    // Static nested Builder class
    public static class SubBuilder {
        private BreadType bread;
        private List<FillingType> fillings;
        private List<SauceType> sauces;
        private boolean toasted;

        // Builder method for bread
        public SubBuilder withBread(BreadType bread) {
            this.bread = bread;
            return this;
        }

        // Builder method for fillings
        public SubBuilder withFillings(List<FillingType> fillings) {
            this.fillings = fillings;
            return this;
        }

        // Builder method for sauces
        public SubBuilder withSauces(List<SauceType> sauces) {
            this.sauces = sauces;
            return this;
        }

        // Builder method for toasted option
        public SubBuilder toasted(boolean toasted) {
            this.toasted = toasted;
            return this;
        }

        // Final build method to return the constructed Sub
        public Sub build() {
            // Validating mandatory fields
            if (bread == null) {
                throw new IllegalStateException("Bread type is required.");
            }
            return new Sub(bread, fillings, sauces, toasted);
        }
    }
}

// Pizza.java

// Pizza Interface
public interface Pizza {
    String getDescription();
    double getPrice();
}

// Concrete Pizza Implementations

// MargheritaPizza class
class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}

// PepperoniPizza class
class PepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    @Override
    public double getPrice() {
        return 6.00;
    }
}

// VeggiePizza class
class VeggiePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Veggie Pizza";
    }

    @Override
    public double getPrice() {
        return 7.00;
    }
}

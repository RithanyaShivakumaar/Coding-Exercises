// ToppingDecorator.java

// ToppingDecorator (Abstract Class)
public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}

// Concrete Topping Implementations

// Cheese class
class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.50;
    }
}

// Olives class
class Olives extends ToppingDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.00;
    }
}

// Mushrooms class
class Mushrooms extends ToppingDecorator {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.25;
    }
}

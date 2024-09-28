import java.util.logging.Logger;

public abstract class Meal {
    // Logger setup
    private static final Logger logger = Logger.getLogger(Meal.class.getName());

    // Template method - defines the skeleton of meal preparation
    public final void prepareMeal() {
        try {
            boilWater();
            addMainIngredient();
            addSpices();
            cook();
            addGarnish();
            serve();
        } catch (Exception e) {
            logger.severe("An error occurred while preparing the meal: " + e.getMessage());
            throw new RuntimeException("Meal preparation failed", e);
        }
    }

    // Concrete step for boiling water
    private void boilWater() {
        logger.info("Boiling water...");
    }

    // Abstract methods for steps that vary between meal types
    protected abstract void addMainIngredient();
    protected abstract void addSpices();
    protected abstract void cook();

    // Optional hook method for adding garnishes (can be overridden)
    protected void addGarnish() {
        logger.info("No garnish added.");
    }

    // Concrete method for serving the meal
    private void serve() {
        logger.info("Meal is served.");
    }
}

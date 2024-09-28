import java.util.logging.Logger;

public class NonVegetarianMeal extends Meal {
    private static final Logger logger = Logger.getLogger(NonVegetarianMeal.class.getName());

    @Override
    protected void addMainIngredient() {
        logger.info("Adding chicken as the main ingredient.");
    }

    @Override
    protected void addSpices() {
        logger.info("Adding chili powder and garlic.");
    }

    @Override
    protected void cook() {
        logger.info("Grilling the chicken.");
    }

    @Override
    protected void addGarnish() {
        logger.info("Adding parsley as garnish.");
    }
}

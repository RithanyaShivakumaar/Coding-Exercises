
import java.util.logging.Logger;

public class VegetarianMeal extends Meal {
    private static final Logger logger = Logger.getLogger(VegetarianMeal.class.getName());

    @Override
    protected void addMainIngredient() {
        logger.info("Adding vegetables as the main ingredient.");
    }

    @Override
    protected void addSpices() {
        logger.info("Adding herbs and garlic.");
    }

    @Override
    protected void cook() {
        logger.info("Stir-frying the vegetables.");
    }

    @Override
    protected void addGarnish() {
        logger.info("Adding cilantro as garnish.");
    }
}

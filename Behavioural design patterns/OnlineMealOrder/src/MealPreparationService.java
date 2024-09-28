import java.util.Scanner;
import java.util.logging.Logger;

public class MealPreparationService {
    private static final Logger logger = Logger.getLogger(MealPreparationService.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Meal selectedMeal = null;

        while (selectedMeal == null) {
            logger.info("Select meal type (1: Vegetarian, 2: Non-Vegetarian): ");
            String input = scanner.nextLine().trim();

            if (validateInput(input)) {
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        selectedMeal = new VegetarianMeal();
                        break;
                    case 2:
                        selectedMeal = new NonVegetarianMeal();
                        break;
                    default:
                        logger.warning("Invalid option, please choose 1 or 2.");
                }
            }
        }

        // Start the meal preparation process
        selectedMeal.prepareMeal();
        scanner.close();
    }

    // Input validation
    private static boolean validateInput(String input) {
        try {
            int choice = Integer.parseInt(input);
            return choice == 1 || choice == 2;
        } catch (NumberFormatException e) {
            logger.warning("Invalid input, please enter a number (1 or 2).");
            return false;
        }
    }
}

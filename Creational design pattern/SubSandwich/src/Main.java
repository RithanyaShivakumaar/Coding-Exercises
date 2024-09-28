import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating a simple sub with wheat bread, turkey filling, and mayo
        Sub turkeySub = new Sub.SubBuilder()
            .withBread(BreadType.WHEAT)
            .withFillings(Arrays.asList(FillingType.TURKEY))
            .withSauces(Arrays.asList(SauceType.MAYO))
            .toasted(true)
            .build();

        System.out.println(turkeySub);

        // Creating a veggie sub with multigrain bread, veggie filling, and mustard + ketchup
        Sub veggieSub = new Sub.SubBuilder()
            .withBread(BreadType.MULTIGRAIN)
            .withFillings(Arrays.asList(FillingType.VEGGIE))
            .withSauces(Arrays.asList(SauceType.MUSTARD, SauceType.KETCHUP))
            .toasted(false)
            .build();

        System.out.println(veggieSub);

        // Creating a chicken sub with gluten-free bread and chipotle sauce
        Sub chickenSub = new Sub.SubBuilder()
            .withBread(BreadType.GLUTEN_FREE)
            .withFillings(Arrays.asList(FillingType.CHICKEN))
            .withSauces(Arrays.asList(SauceType.CHIPOTLE))
            .toasted(true)
            .build();

        System.out.println(chickenSub);
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Meal firstMeal = Meal.BREAKFAST;
        //firstMeal = Meal.SNACK;
        Meal secondMeal = Meal.LUNCH;
        Meal thirdMeal = Meal.DINNER;

        System.out.println("firstMeal.name() == " + firstMeal.name());
        System.out.println("firstMeal.ordinal() == " + firstMeal.ordinal());

        System.out.println("secondMeal.name() == " + secondMeal.name());
        System.out.println("secondMeal.ordinal() == " + secondMeal.ordinal());

        System.out.println("thirdMeal.name() == " + thirdMeal.name());
        System.out.println("thirdMeal.ordinal() == " + thirdMeal.ordinal());
    }
}

public class TotalMealPrice
{
    /* public static void calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate)
    {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

     public static void main(String[] args)
    {
        calculateTotalMealPrice(100, .20, .08);
    } */

    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate)
    {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
    }

    public static void main(String[] args)
    {
        double groupTotalMealCost = calculateTotalMealPrice(100, .2, .08);
        System.out.println("The total cost of the meal: " + groupTotalMealCost);

        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println("The individual cost of the meal: " + individualTotalMealCost);
    }
}

public class BudgetCalculator
{
    final static double SALARY = 3000.0;
    final static double SAVINGS_PERCENT = 0.20;
    final static double RENT_PERCENT = 0.30;
    final static double GROCERIES_PERCENT = 0.15;
    final static double ENTERTAINMENT_PERCENT = 0.10;

    public static void main(String [] args)
    {
    
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;
        
        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = totalExpenses - monthlySalary;

        System.out.println(monthlySalary);
        System.out.println(savedAmount);
        System.out.println(rentAmount);
        System.out.println(groceriesAmount);
        System.out.println(entertainmentAmount);
        System.out.println(totalExpenses);
        System.out.println(remainingBalance);
        
    }
}




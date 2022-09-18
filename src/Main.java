public class Main
{
    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double yearlyInterest = 0.17;
        double monthlyInterest = yearlyInterest / 12;
        double monthOne, monthTwo;

        monthOne = (creditCardBalance * monthlyInterest) + creditCardBalance;
        monthTwo = (monthOne * monthlyInterest) + monthOne;

        System.out.println("The balance + interest for month one = " + monthOne);
        System.out.println("The balance + interest for month two = " + monthTwo);
    }
}
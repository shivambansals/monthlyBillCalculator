import java.util.Scanner;

public class MonthlyBillCalculator {
    private int numberOfMinutes;

    public MonthlyBillCalculator(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public void monythlyBill() {
        double callAmount = (numberOfMinutes - 300) * 1.2;
        double gstAmt = (callAmount * 18) / 100;
        double bill = gstAmt + callAmount;
        if (numberOfMinutes <= 300)
            System.out.println("monthly bill for calling" + numberOfMinutes + "minutes is" + 0.0);
        else
            System.out.println("monthly bill for calling" + numberOfMinutes + "minutes is" + bill);

    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        System.out.println("Number of minutes you talk on your jio in a month is");
        n = scanner.nextDouble();
        MonthlyBillCalculator monthlyBillCalculator = new MonthlyBillCalculator((int) n);
        monthlyBillCalculator.monythlyBill();
    }
}

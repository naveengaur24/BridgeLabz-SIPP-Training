import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = 0.05 *salary;
            System.out.println("Bonus amount is" + bonus);
        }
        else {
            System.out.println("No bonus for less than 5 years of service");
        }
    }
}

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        }
        else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of "+ number +" is " +factorial);
        }
    }
}

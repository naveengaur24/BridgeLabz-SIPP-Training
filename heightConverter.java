import java.util.Scanner;

public class heightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double cm = sc.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + cm+ " while in feet is "+ feet +" and inches is " + inches);
    }
}

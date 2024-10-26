import java.util.Scanner;

public class FindSmallestValue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers to input: ");
        int numberOfIntegers = input.nextInt();

        if (numberOfIntegers <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.print("Enter integer 1: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= numberOfIntegers; i++) {
            System.out.print("Enter integer " + i + ": ");
            int currentNumber = input.nextInt();

            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
        }

        System.out.println("The smallest number is: " + smallest);

    }
}

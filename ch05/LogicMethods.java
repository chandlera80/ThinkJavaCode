import java.util.Scanner;

public class LogicMethods
{
    public static void main(String[] args)
    {
        int num;

        printIsLarge(120);
        printIsLarge(23);
        printIsLarge(140);
        printIsLarge(45);
        printIsLarge(234);
        printLargest(7, 25);
        printLargest(6, 11);
        printLargest(6, 6);
        printLargestOdd(10, 8);
        printLargestOdd(7, 13);
        printLargestOdd(27,35);
    }

    public static void printIsLarge(int num)

    {
        if ((num > 99)) System.out.println("The number is large");


        int number;
        printIsLargeOrSmall(112);
        printIsLargeOrSmall(8);
        printIsLargeOrSmall(234);
    }

    public static void printIsLargeOrSmall(int number)
    {
        if ((number > 99)) System.out.println("The number is large");

        if ((number < 10)) System.out.println("The number is small");
    }

    public static void printLargest(int number1, int number2)
    {


        if ((number1 > number2)) System.out.println("The largest number is:" + number1);

        if ((number1 < number2)) System.out.println("The largest number is: " + number2);

        if ((number1 == number2)) System.out.println("The numbers are equal ");

    }

    public static void printLargestOdd(int number1, int number2)

    {
        if ((number1 > number2) && (number1 % 2 != 0))
        {
            System.out.println("The largest odd number is: " + number1);

        } else if (((number1 < number2) && (number2 % 2 != 0)))
        {
            System.out.println("The The largest odd number is: " + number2);

        } else if ((number1 % 2 == 0) && (number2 % 2 == 0))

        {
            System.out.println("Neither number is odd");

        }  if ((number1 % 2 != 0) && (number2 % 2 != 0))

        {
            System.out.println("Two odds make an even " + (number1 + number2));
        }
    }
}







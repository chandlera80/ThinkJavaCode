public class printIsLargeOrSmall
{
    public static void main(String[] args)
    {
        int number;
        printIsLargeOrSmall(112);
        printIsLargeOrSmall(8);
        printIsLargeOrSmall(234);
    }

    public static void printIsLargeOrSmall (int number)
    {
        if ((number > 99)) System.out.println("The number is large");

        if ((number < 10)) System.out.println("The number is small");
    }
}

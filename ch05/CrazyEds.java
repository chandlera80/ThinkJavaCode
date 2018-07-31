import java.util.Scanner;

public class CrazyEds

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of cheese?");

        int diameter = scanner.nextInt();
        System.out.println("How many yard of cheese?");
        int theirYards = scanner.nextInt();
        cheeseSize(diameter, theirYards);
    }

    public static void cheeseSize (int diameter, int theirYards )


    {
        switch (diameter)
        {
            case 1:
               if (theirYards < 50)
                   System.out.println("Your price will be:" + "$" +(((theirYards * 2)*2 ) + 5));
               else
                System.out.println("Your price will be:" + "$" +((diameter ) + (theirYards * 2) + 5));
                break;
            case 2:
                if (theirYards < 75)
                System.out.println("Your price will be:" + "$" +( ((theirYards * 4)*2 ) + 5));
                else
                System.out.println("Your price will be:" + "$" +((theirYards * 2) + 5));
                break;
            case 3:
                if (theirYards < 25)
                System.out.println("Your price will be:" + "$" +( ((theirYards *6)*4)+ 5));
                else
                System.out.println("Your price will be:" + "$" +((theirYards * 6) + 5));
                break;
            default:
                System.out.println("That order is too crazy!!");
        }
    }

    }



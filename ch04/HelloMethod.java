public class HelloMethod
{
    public static void main(String[] args)
    {
        String firstName = "Amanda";
        String secondName = "Wilma";
        String lastName = "Flinestone";
        String cat = " meow!";


        printHelloWorld(firstName, lastName);
        printOhNo(cat);
        printHelloWorld(secondName, lastName);
        printOhNo(cat);


    }


    public static void printHelloWorld(String fname, String lName)
    {
        System.out.println("Hello World " + fname + " " + lName);

    }

    public static void printOhNo(String cat)
    {
        System.out.println("Oh no!!!!!!!!!!!" + cat);
    }
}




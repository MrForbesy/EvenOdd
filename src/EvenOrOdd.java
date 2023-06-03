public class EvenOrOdd
{
    public static void main(String[] args)
    {
       int numToCheck = 5;

        System.out.println("Is " + numToCheck + " even or odd?");

        if(numToCheck % 2==0)
        {
            System.out.println(numToCheck + " is an even number.");
        }
        else
        {
            System.out.println(numToCheck + " is an odd number.");
        }

    }
}
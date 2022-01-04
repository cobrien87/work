import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to venture to [K]lavalonia or [R]essonae?");
        String firstChoice = input.nextline();
        if (firstChoice.toUpperCase().substring(0,1).equals("K")){
            System.out.println("Would you like to explore the [C]averns or the [W]ild reserves.");
        }
        if (firstChoice.toUpperCase().substring(0,1).equals("R")){
            System.out.println(".");

        }

    }
}

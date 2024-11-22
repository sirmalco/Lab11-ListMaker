import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        boolean quit = false;

        while(!quit)
        {
            System.out.println("A – Add an item to the list\n" +
                    "D – Delete an item from the list\n" +
                    "I – Insert an item into the list\n" +
                    "P – Print (i.e. display) the list\n" +
                    "Q – Quit the program ");
            String ans = scanner.nextLine();

            if(ans.equals("A"))
            {
                String add;
                System.out.println("Enter what you want to add: ");
                add = scanner.nextLine();
                list.add(add);
            }

            if(ans.equals("D"))
            {
                System.out.println("What position would you like to remove something? (0-" + list.size() + ")");
                int pos = scanner.nextInt();
                list.remove(pos);
            }
            if(ans.equals("I"))
            {
                System.out.println("Enter what you would like to add?");
                String add = scanner.nextLine();
                System.out.println("What position? (0-" + list.size() + ")");
                int pos = scanner.nextInt();
                list.add(pos, add);
            }

            if(ans.equals("P"))
            {
                System.out.println(list);
            }

            if(ans.equals("Q"))
            {
                System.out.println("Are you sure you want to quit? (Y/N)");
                String stop = scanner.nextLine();
                if(stop.equals("Y"))
                {
                    quit = true;
                }
            }
        }

    }
}

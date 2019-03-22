import java.util.*;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args)
    {

        System.out.println("Hello Java SE 8 Test!");

        List<String> items = new ArrayList<>();
                    items.add("Pen");
        items.add("Pencil");
        items.add("Box");

        System.out.print(" "+items.get(0));
        System.out.print(" --------- ");
        System.out.print(" "+items.get(1));
        System.out.print(" --------- ");
        System.out.print(" "+items.get(2));
        System.out.print(" --------- ");

        System.out.print(" I added more change to test ");
        System.out.print(" ---- 12345 ----- ");
    }
}


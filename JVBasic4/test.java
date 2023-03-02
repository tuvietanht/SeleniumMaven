package JVBasic4;

import java.util.ArrayList;
import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for ( int i = 0 ; i <= 50 ; i+=2)
        {
            System.out.println(i);
            arr.add(i);
        }

        System.out.println("------------------");
        for ( int i = 0 ; i < arr.size() ; i++)
        {
            System.out.println(arr.get(i));
        }
    }
}

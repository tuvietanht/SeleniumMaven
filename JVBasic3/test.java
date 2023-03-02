package JVBasic3;

import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        System.out.println("4.6>4.5 : " + (4.6>4.5) );
        System.out.println("a<b : " + ('a'<'b'));
        System.out.println("1!=1 : " + (1!=1));
        System.out.println();

        Scanner p = new Scanner(System.in);
        System.out.print("a : ");
        int a = p.nextInt();

        System.out.print("b : ");
        int b = p.nextInt();
        if (a == b)
        {
            System.out.println("a = b");
        }
        else if ( a < b)
        {
            System.out.println("a < b");
        }
        else
        {
            System.out.println("a > b");
        }

    }
}

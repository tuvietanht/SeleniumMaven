package JVOOP12;
import JVOOP12.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
public class test {

    public static programmer createNew()
    {
        try {
            Scanner p = new Scanner(System.in);
            System.out.println("1.Junior 2.Fresher");
            System.out.print("Select your option : ");
            int select = p.nextInt();

            System.out.print("Age : ");
            int age = p.nextInt();

            System.out.print("Sex : ");
            String sex = p.next();

            System.out.print("Phone : ");
            String phone = p.next();

            System.out.print("Salary : ");
            Double salary = p.nextDouble();

            System.out.print("Hour working : ");
            int hour = p.nextInt();

            System.out.print("Day off : ");
            int dayOff = p.nextInt();
            if (select == 1) {
                programmer temp = new junior(age, sex, phone, salary, hour, dayOff);
                return temp;
            } else {
                programmer temp = new fresher(age, sex, phone, salary, hour, dayOff);
                return temp;
            }
        }
        catch (Exception e)
        {
            System.out.println("Error plz try again");
            return createNew();
        }
    }



    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        ArrayList<programmer> base = new ArrayList<>();

        while(true)
        {
          base.add(createNew());
          System.out.println("1.Continue 2.Pause");
          System.out.print("Your option : ");
          int option = p.nextInt();
          if ( option ==2){break;};
          System.out.println();
        }


        for ( int i = 0 ; i < base.size(); i++)
        {
            programmer test = base.get(i);
            test.showAll();
            System.out.println();
        }



    }
}

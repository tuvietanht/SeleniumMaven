package JVBasic5;

import java.util.ArrayList;
import java.util.Scanner;
public class test {

    public static student GetStudent()
    {
        try
        {
            Scanner p = new Scanner(System.in);
            System.out.print("Name : ");
            String name = p.nextLine();

            System.out.print("ID: ");
            String id = p.nextLine();

            System.out.print("Age : ");
            int age = p.nextInt();
            student base = new student(name,age,id);
            return base;
        }
        catch (Exception e)
        {
            System.out.println("age must be interger number ");
            return GetStudent();
        }
    }


    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        while (true)
        {
            Scanner p = new Scanner(System.in);
            arr.add(GetStudent());
            System.out.println();
            System.out.println("1.Continue      2.Stop");
            System.out.print("Your select : ");
            int select = p.nextInt();
            if (select == 2){break;}
        }
        for ( int i = 0 ; i < arr.size() ; i++)
        {
            student base = (student) arr.get(i);
            System.out.println("Student " + (i+1));
            System.out.println("Name : " + base.getName());
            System.out.println("ID : " + base.getId());
            System.out.println("Age : " + base.getAge());
            System.out.println();
        }
    }
}

package JVBasic2;

public class test {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println(a + " + " + b  + " = " + new Calculator().cal(10,20));


        double c = 1.3;
        double d = 2.4;
        System.out.println(c + " * " + d  + " = " + new Calculator().cal(c,d));

        

    }
}

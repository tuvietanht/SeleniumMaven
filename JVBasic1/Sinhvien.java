package JVBasic1;

public class Sinhvien {
    public static void main(String[] args)
    {
        InforInstance instance = new InforInstance("ngoc" , 20);
        System.out.println("Instance method : ");
        instance.display();


        System.out.println();
        System.out.println("Local method : ");
        new InforLocal().display();


        System.out.println();
        System.out.println("Static method : ");
        InforStatic.name = "David";
        InforStatic.age = 20;
        InforStatic.display();


    }
}

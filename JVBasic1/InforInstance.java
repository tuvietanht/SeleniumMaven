package JVBasic1;

public class InforInstance {
    public String name;
    public int age;
    InforInstance(){};
    InforInstance(String name , int age)
    {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

}

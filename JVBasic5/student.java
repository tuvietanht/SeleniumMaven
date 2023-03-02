package JVBasic5;

public class student {
    public String name;
    public int age;
    public String id;
    student(String name, int age , String id )
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
}

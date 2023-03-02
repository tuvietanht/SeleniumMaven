package JVOOP12;

public abstract class programmer  {
    private int age;
    private String sex;
    private String phone;
    protected programmer(int age, String sex, String phone) {
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }
    public void display()
    {
        System.out.println("Age : " + this.age);
        System.out.println("Sex : " + this.sex);
        System.out.println("Phone : " + this.phone);
    }
    public abstract void showAll();
}

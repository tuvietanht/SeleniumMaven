package JVOOP12;

public class fresher extends programmer implements total {
    private double salary;
    private int hourWorking;
    private int dayOff;
    private double bonus = 1.5;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHourWorking() {
        return hourWorking;
    }

    public void setHourWorking(int hourWorking) {
        this.hourWorking = hourWorking;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public fresher(int age, String sex, String phone, double salary, int hourWorking, int dayOff) {
        super(age, sex, phone);
        this.salary = salary;
        this.hourWorking = hourWorking;
        this.dayOff = dayOff;
    }

    @Override
    public double totalSalary()
    {
        if ( this.dayOff == 0 )
        {
            return   ((salary*0.3) + (salary*bonus));
        }
        else { return (salary*bonus);}
    };

    @Override
    public void showAll()
    {
        super.display();
        System.out.println("Salary : " + this.salary);
        System.out.println("hourWorking : " + this.hourWorking);
        System.out.println("Dayoff : " + this.dayOff);
        System.out.println("Salary : " +  this.totalSalary());
        System.out.println();
    }
}

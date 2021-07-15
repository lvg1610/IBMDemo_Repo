public class Employee
{
    private int empid;
    private double salary;
    public Employee(){}
    public Employee(int ssn,String name,int age,int empid,double salary)
    {
        super(ssn,name,age);
        this.empid=empid;   this.salary=salary;
    }
    public void showEmployee()
    {
        showPerson();
        System.out.println("Empid is "+empid);
        System.out.println("Salary is "+salary);
    }
}
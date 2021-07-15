public class Person
{
    private int ssn;
    private String name;
    private int age;
    public Person(){}
    public Person(int ssn,String name,int age)
    {
        this.ssn=ssn;  this.name=name;   this.age=age;
    }
    public void showPerson()
    {
        System.out.println("Ssn is "+ssn);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
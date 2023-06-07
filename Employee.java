class Employee
{
float salary=40000;
}
class Programer extends Employee
{
int bonus=10000;
public static void main(String args[])
{
Programer p=new Programer();
System.out.println("Programming salary is:"+p.salary);
System.out.println("bonus of Programmeris:"+p.bonus);
}
}
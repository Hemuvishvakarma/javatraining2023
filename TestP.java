import java.util.Scanner;
class Polymor{
void print()
{
 System.out.println("welcome.....");
}
void print(String n)
{
System.out.println("welcome....."+n);
}
}
class TestP
{
public static void main(String args[])
{
Polymor ob1=new Polymor();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name:");
String s=sc.next();
ob1.print(s);
}
}

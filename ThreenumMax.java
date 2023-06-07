import java.util.Scanner;
class ThreenumMax
{
public static void main(String args[])
{
int max,min;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");

int a=sc.nextInt();
System.out.println("enter first number");
int b=sc.nextInt();
System.out.println("enter second number");
int c=sc.nextInt();
System.out.println("enter second number");

if(a>b||b<c)
{
System.out.println("The smallest Value is "+a);
}
else if(a>b||b>c){

System.out.println(" The smallest value is "+c);
}
else{
System.out.println("The  Smallest value is "+b);
}
}
}
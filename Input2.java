import java.util.Scanner;
class Input2
{
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public static int sub(int a,int b)
{
int c=a-b;
return c;
}

public static int mul(int a,int b)
{
int c=a*b;
return c;
}

public static int div(int a,int b)
{
int c=a/b;
return c;
}
public static int exp(int a,int b)
{
int c=a^b;
return c;
}
public static int mod(int a,int b)
{
int c=a%b;
return c;
}
public static void main (String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");//5
int num1;
num1=scob.nextInt();
System.out.print("Enter a number:");//7
int num2;
num2=scob.nextInt();
//num1=5,num2=7
System.out.println(num1 +"+"+num2 +"=" +add(num1,num2));
System.out.println(num1 +"-"+num2 +"=" +sub(num1,num2));
System.out.println(num1 +"*"+num2 +"=" +mul(num1,num2));
System.out.println(num1 +"/"+num2 +"=" +div(num1,num2));
System.out.println(num1 +"^"+num2 +"=" +exp(num1,num2));
System.out.println(num1 +"%"+num2 +"=" +mod(num1,num2));
}//main()
}//input1
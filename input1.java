import java.util.Scanner;
class Input1
{
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
System.out.println("num1="+ num1 +","+"num2="+ num2);
int num3; 
num3=num1+num2;
System.out.println("Addition of 1&2 :"+num3);
num3=num1-num2; 
System.out.println("substraction of 1&2:"+num3);
}//main()
}//input1
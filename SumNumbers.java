import java.util.Scanner;
public class SumNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum = 0;
int i;
for(i=0;i<=a;i++)
{
sum =sum+ i;
}
System.out.println("Sum: "+sum);
}
}
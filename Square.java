import java.util.Scanner;
public class Square
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int p=1;
for(int i=1;i<=b;i++)
{
p=a*p;
}
System.out.println(p);
}
}
import java.util.Scanner;
public class MulNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int mul = 1;
int i;
for(i=1;i<=a;i++)
{
mul =mul* i;
}
System.out.println("product: "+mul);
}
}
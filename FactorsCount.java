import java.util.*;
import java.util.Scanner;
class FactorsCount
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
for(int i=1;i<=a;i++)
{
if(a%i==0)
{ 
count++;
System.out.print(i);
if(i!=a)
{
System.out.print(",");
}

}
}
System.out.println("\n count of factors of"+count);
}
}


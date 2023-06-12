import java.util.Scanner;
import java.util.*;
class Fabinacci
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.print("enter thye nth values");
n=sc.nextInt();
System.out.println("Fibinacci Sreies:");
while(sum<=n)
{
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}
}




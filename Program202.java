import java.util.*;
import java.util.Scanner;
public class Program202
{
public static boolean isEven(int n)
{
return((n/2)*2==n);}
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Emter the number:");
n = sc.nextInt();
if(isEven(n))
{
System.out.println("EVEN\n");
}
else {
System.out.println("ODD\n");
}
}
}
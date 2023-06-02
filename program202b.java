import java.util.*;
import java.util.Scanner;
public class program202b{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Emter the number:");
n = sc.nextInt();
if(n/2*2==n)
{
System.out.println("EVEN\n");
}
else {
System.out.println("ODD\n");
}
}
}
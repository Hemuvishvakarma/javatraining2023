import java.util.*;
public class Program205d
{
public static void main(String args[])
{
char ch;
System.out.print("enter a number");
Scanner sc =new Scanner(System.in);
ch = sc.next().charAt(0);
System.out.println();
if((ch>='1'&&ch<='9'))
System.out.println(ch+ "is an number");
else
System.out.println(ch+ "is not an number");
}
}
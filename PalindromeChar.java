import java.util.Scanner;
class PalindromeChar
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String rs="";
System.out.print("enter a string");
String n=sc.next();
int len=n.length()-1;
n=n.toLowerCase();
 for(int i=len;i>=0;i--)
{
  rs=rs+n.charAt(i);
}
System.out.println(n+" "+rs);
    
if(n.equals(rs))
   System.out.print("yes");
else
{
    System.out.println("no");
}
}
}


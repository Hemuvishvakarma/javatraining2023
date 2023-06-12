import java.io.*;
import java.util.*;
class Test
{
static boolean isNumber(String s)
  {
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
{return false;}
}

return true;
}
 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
//Function return 1if all elments are in not an integer
if(isNumber(str))
System.out.println("Integer");
//Functional returns 0 if input is not an integer 
else 
System.out.println("String");
}
}

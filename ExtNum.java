import java.util.Scanner;
class ExtNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(int i=0;i<str.length()-1;i++)
{
if(str.charAt(i)>='0' && str.charAt(i)<='9')
{
System.out.print(str.charAt(i));
}
}
}
}
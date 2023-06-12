import java.util.Scanner;
class TestChar
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
String r=str.replaceAll(c,"");
System.out.print(r);
}
}


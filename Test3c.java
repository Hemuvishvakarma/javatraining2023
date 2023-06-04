import java.util.Scanner;
class Test3c
{
public static void main(String args[])
{
int a,b;
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
b=sc.nextInt();
String str="";
for(int i=0;i<=a;i=i+b)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));
}
}
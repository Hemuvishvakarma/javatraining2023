import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int d,res=0;
int a=s;
while(a>0)
{
d=a%10;
res=res*10+d;
a=a/10;
}
if(res==s)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}


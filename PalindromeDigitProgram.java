import java.util.Scanner;
class PalindromeDigitProgram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n1=sc.nextInt();
int n=n1;
int k=0;
while(n>0)
{
k=k*10+(n%10);
n=n/10;
}
System.out.println("Reverse number is: "+k);
if(n1==k)
{
System.out.println("palindrome");
}
else
{
System.out.println("Not palindrome");
}
}
}
import java.util.Scanner;
public class ProDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sd=1;
while(n>0)
{
sd=sd*(n%10);
n=n/10;
}
System.out.println(sd);
}
}


import java.util.Scanner;
class Day5while
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int counter=0;
int b=0;
while(counter<=i)
{
b=b+counter;
counter++;
}
System.out.println(b);
}
}
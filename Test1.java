import java.util.Scanner;
import java.util.Arrays;
class Test1
{

public static void main(String args[])
{
int n,i=0,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("enter no of elements in array:");
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{ a[i]=s.nextInt();}

Arrays.sort(a);

System.out.println(a[0]+" "+a[a.length-1]);
for(int y:a)
{
sum+=y;
}
float avg=(float)sum/n;
System.out.println(sum+"\n"+avg);
}
}








import java.util.Scanner;
class Day5ifexample
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();

if(i<j)
{
System.out.println(j+"maxx");
}
else{
System.out.println(i+"min");
}
}
}
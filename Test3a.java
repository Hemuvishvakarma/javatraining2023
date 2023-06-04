import java.util.Scanner;
class Test3a
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int inc=sc.nextInt();
for(int i=0;i<=m;i=i+inc)
{
System.out.print(+i);
if(i<m)
{
System.out.print(",");
}
}
}
}

import java.util.Scanner;
class EvenIf2
{
public static void main (String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
if((dn/2)*2==0){System.out.println("EVEN");}
else {System.out.println("ODD");}
}
}
import java.util.Scanner;
class MonthNum1
{
public static void main (String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
switch(dn){
case 0:System.out.println("JAN");break;
case 1:System.out.println("FEB");break;
case 2:System.out.println("MARCH");break;
case 3:System.out.println("APRIL");break;
case 4:System.out.println("MAY");break;
case 5:System.out.println("JUNE");break;
case 7:System.out.println("JULY");break;
case 8:System.out.println("AUG");break;
case 9:System.out.println("SEPT");break;
case 10:System.out.println("OCT");break;
case 11:System.out.println("NOV");break;
case 12:System.out.println("DEC");break;
default:System.out.println("INVALID");
}
}
}
import java.util.Scanner;
class DayNumIf
{
public static void main (String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
if(dn==0){System.out.println("sunday");}
else if(dn==1){System.out.println("MONDAY");}
else if(dn==2){System.out.println("tuesday");}
else if(dn==3){System.out.println("wednesdaY");}
else if(dn==4){System.out.println("tursdaY");}
else if(dn==5){System.out.println("friDAY");}
else if(dn==6){System.out.println("saturDAY");}
else {System.out.println("INVALID");}
}
}


import java.util.Scanner;
import java.util.*;
class PatternNum3
{
public static void printLine(int a)
{
for(int i=1;i<=a;i++){
System.out.print(i);
}
}
public static void printPattern(int a)
{
for(int i=a;i>=1;i--){ 
System.out.print("\n");
printLine(i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
printPattern(a);
}
}
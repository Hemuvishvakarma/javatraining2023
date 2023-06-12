import java.util.Scanner;
import java.util.*;
class PatternNum
{
public static void printLine(int a)
{
for(int i=1;i<=a;i++){
System.out.println(i);
}
public static void printPattern(int a)
{
for(int i=1;i<=a;i++){ 

System.out.println("\n");
printLine(i);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
printPattern(a);
}
}
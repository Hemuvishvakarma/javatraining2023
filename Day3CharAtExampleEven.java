public class Day3CharAtExampleEven
{
 public static void main (String args[])
{  
   String str="Welcome to Java Training";

for(int i=0;i<=str.length()-1;i++)
{
if(i%2==0){
System.out.println("Char at "+i+"place"+str.charAt(i));
}
}
}
}
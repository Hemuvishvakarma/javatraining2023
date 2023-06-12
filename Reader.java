import java.io.*;
public class Reader
{
public static void main(String args[])throws Exception
{
InputStreamReader r=new InputSteramReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter Your name:");
String name=br.readLine();
System.out.println("welcome.."+name);
}
}
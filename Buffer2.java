import java.io.*;
public class Buffer2
{
public static void main(String args[])
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name="";
while(!name.equals("stop"))
{
System.out.println("Enter data:");
name=br.readLine();
System.out.println("data is:"+name);
}
br.close();
r.close();
}
}

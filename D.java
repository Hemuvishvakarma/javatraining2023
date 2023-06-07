class C
{
 public void disp()
{
  System.out.println("method of class c");
}
}
class A extends C
{
public void disp()
{
 System.out.println("method of class b"); 
}
}
class D extends A
{
public void disp()
{
System.out.println("method of class D");
}
public static void main(String args[])
{
D d=new D();
d.disp();
}
}



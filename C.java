class C
{
 public void disp()
{
  system.out.println("method of class c");
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
void void disp()
{
Sytem.out.println("method of class D");
}
}
public static void main(String args[])
{
D d=new D();
d.disp();
}
}



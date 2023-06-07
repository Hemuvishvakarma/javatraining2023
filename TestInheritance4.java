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
class TestInheritance4
{
public static void main(String args[])
{
D obj=new D();
obj.disp();
}
}



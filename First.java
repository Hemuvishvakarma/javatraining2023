class First
{
public static void main(String args[])throws Exception
{
Thread t=Thread.currentThread();
System.out.println("CuRRENT THREAD="+t);
t.setName("NewThreadbyHemant");
t.setPriority(t.getPriority()-1);
System.out.println("current therad"+t);
System.out.println("Name"+t.getName());
}
}
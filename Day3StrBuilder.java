class Day3StrBuilder
{
  public static void main (String arhgs[])
{
 StringBuilder s1=new StringBuilder("hello");
 StringBuilder s2=new StringBuilder("World");
 StringBuilder s=s1.append(s2);
System.out.println(s.toString());
}
}
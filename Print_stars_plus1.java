class Print_stars_plus1
{
  public static void Print_mul_chars(int i,char c)
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.print(c);
}
public static void main(String args[])
{
int j=5;
Print_mul_chars(j,"*");
System.out.print(j+1,'+');
}
}
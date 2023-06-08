class Student1
{ 
int rollno;
String name;
static String college="ITS";
static void changes()
{
  college="A.M.REDdy";
}
Student1(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Details
{
public static void main(String args[])
{
Student1 s=new Student1(111,"hemant");
Student1 s1=new Student1(112,"Mahesh");
Student1 s2=new Student1(113,"KirAn");
Student1 s3=new Student1(114,"sreekanth");

s.display();
s1.display();
s2.display();
s3.display();
}
}


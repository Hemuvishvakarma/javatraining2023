
class Student
{
int rollno;
String name;
static String college="MTIEAT";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Mtieat
{
public static void main(String args[])
{
Student s=new Student(111,"Hemant");
Student.college="hemant";
s.display();
}
}

class Student
{
 int rollno;
String name;
Student(){rollno=0;name=" ";}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent5
{
public static void main(String args[])
{
Student s1;
s1=new Student(111,"Hemanth");
Student s2=new Student(222,"kmn");
s1.display();
s2.display();
}
}

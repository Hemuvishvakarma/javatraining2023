class Emp{
 int id;
String name;
float salary;
void insert(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void display(){
System.out.println(id+" "+name+" "+salary);
}
}
public class TestEmployee
{
public static void main(String args[])
{
Emp s1=new Emp();
Emp s2=new Emp();
Emp s3=new Emp();
s1.insert(111,"hem",35000);
s2.insert(112,"kir",350000);
s3.insert(113,"mahhe",305000);
s1.display();
s2.display();
s3.display();
}
}


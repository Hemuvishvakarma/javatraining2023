
 class Address
{
  String city,state,country;
public Address(String city,String state,String country)
{
 this.city=city;
this.state=state;
this.country=country;
}
} 
class Emp
{
 int id;
String name;
Address address;
public Emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.country);
}
public static void main(String args[])
{
Address address1=new Address("chitooor","AP","india");
Address address2=new Address("palamaner","AP","india");
Emp e1=new Emp(111,"tharun",address1);
Emp e2=new Emp(112,"tulasi",address2);
e1.display();
e2.display();
}
}

class Auther
{
String autherName;
int age;
String place;
Auther(String name,int age,String place)
{
this.autherName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Auther auther;
Book(String n,int p,Auther auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[])
{
Auther auther=new Auther("John",42,"USA");
Book b=new Book("java",800,auther);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("...........Auther details............");
System.out.println("auther name:"+b.auther.autherName);
System.out.println("auther age:"+b.auther.age);
System.out.println("auther place:"+b.auther.place);
}
}





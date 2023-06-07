class Animal
{
void eat()
{
System.out.println(".......eating......");
}

}
class Dog extends Animal
{
void bark()
{
System.out.println("........barking.....");
}
}
class Cat extends Animal
{
void Meow()
{
  System.out.println(".....Meowing.....");
}
}
class TestInheritance3
{
public static void main(String args[])
{
Cat d=new Cat();
d.Meow();
d.eat();
Dog c=new Dog();
c.bark();
c.eat();

}
}
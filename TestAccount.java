class Account{
 int acc_no;
String name;
float amount;
void insert(int a,String n,float amt)
{
acc_no=a;
name=n;
amount=amt;
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println(amt+"deposited ");
}

void withdraw(float amt)
{
if(amount<amt)
{
System.out.println("Innsuffient balance");
}
else
{
amount=amount-amt;
System.out.println(amt+"withdrawn");
}
}
void checkBalance()
{
System.out.println("Balance is:"+amount);
}
} 
class TestAccount
{
public static void main(String args[])
{
Account a1=new Account();
a1.insert(83245,"Ankit",1000);
a1.checkBalance();
a1.deposit(40000);
a1.checkBalance();
a1.withdraw(15000);
a1.checkBalance();
}
}


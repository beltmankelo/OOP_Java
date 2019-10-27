import java.io.*;
import java.util.Scanner;


class Bank
{
   String name=new String();
   long ac;
   String type=new String();
   double am;
   static double roi=0.05;
   Bank()
   {
   	name="Adithya";
   	ac=180905020;
   	type="Savings";
   	am=10500;
   	
   }
   Bank(String n,long c,String t,double a)
   {
   	name=n;
   	ac=c;
   	type=t;
   	am=a;
   }
   void Deposit(double a)
   {
   	am+=a;
   }
   void Withdraw(double a)
   {
   	if(am<1000)
   		System.out.println("Under Minimum Account Balance");
   	else if(a>am)
   		am-=a;
   }
   void Display()
   {
   	System.out.println("Account holder details:\nName:"+this.name+"\nAccount Number"+this.ac+"\nType of account:"+this.type+"\nTotal Amount"+this.am);

   }
  static void Rate()
  {
    System.out.println("\nRate of interest"+roi);
  }
}
class BankAc
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		Bank b=new Bank();
		b.Display();
		Bank.Rate();
		Bank c=new Bank("Nayak",190908080,"Current",140000);
		c.Display();
		Bank.Rate();
		Bank n=new Bank();
		System.out.println("Enter Name,Account number,Type of Account, total amount, and rate of interest");
		n.name=sc.next();
		n.ac=(long)sc.nextDouble();
		n.type=sc.next();
		n.am=sc.nextDouble();
		Bank.roi=sc.nextDouble();
		System.out.println("Please enter D-Deposit or W-Withdraw or P-Display or E-Exit");
        do{
        	
        System.out.println("Enter choice");
        ch=sc.next().charAt(0);
        switch(ch)
        {
        	case 'D':
        	System.out.println("Enter amount to deposit");
        	double a=sc.nextDouble();
            n.Deposit(a);
            break;
            case 'W':
             System.out.println("Enter amount to withdraw");
        	a=sc.nextDouble();
            n.Withdraw(a);
            break;
            case 'P':
            n.Display();
			Bank.Rate();
			break;

        }

	}while(ch!='E');
}
}
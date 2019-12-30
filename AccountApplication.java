package deloitte;
import java.util.Scanner;
public class AccountApplication {
	public static void main(String[] args){
		int k=1;
		int c;
		AccountOperations oper = new AccountOperations();
		while(k<2)
		{
		System.out.println("1: deposit");
		System.out.println("2: withdrawl");
		System.out.println("3: balance enquiry");
		System.out.println("4: exit");
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		if(c==1||c==2||c==3||c==4)
		{
		switch(c)
		{
		case 1:
		{
			System.out.println("Enter the account number and amount to be deposited");
			oper.deposit(sc.nextInt(), sc.nextDouble());
			break;
		}
		case 2:
		{
			System.out.println("Enter the account number and amount to be withdrawl");
			oper.withdrawl(sc.nextInt(), sc.nextDouble());
			break;
		}
		case 3:
		{
			System.out.println("Enter the account number");
			oper.checkBalance(sc.nextInt());
			break;
		}
		case 4:
		{
			k++;
			break;
		}
		}	
		}
		else
			System.out.println("enter number between 1 to 4");	
		}
	}
}
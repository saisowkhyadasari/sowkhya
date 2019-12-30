package deloitte;

public class AccountOperations {
	Account[] accounts = new Account[5];
	public AccountOperations() {
		accounts[0] = new Account(10011, "deloitte", 8000);
		accounts[1] = new Account(10012, "deloitte1", 10000);
		accounts[2] = new Account(10013, "deloitte2", 12000);
		accounts[3] = new Account(10014, "deloitte3", 14000);
		accounts[4] = new Account(10015, "deloitte4", 150000);
	}
	void deposit(int accno,double amount)
	{
		int k=0;
		for(int i=0;i<5;i++)
		{
				if(accno==accounts[i].getAccno())
					{
					accounts[i].setBalance(accounts[i].getBalance()+amount);
					System.out.println("updated balance="+accounts[i].getBalance());
					k++;
					}
					
				}
		try
		{ if(k!=1)
			
			throw new InvalidAccountNumberException();
		
		}	catch(InvalidAccountNumberException e){
					System.out.println(e.getMessage());	
				}	
			}
		
	void withdrawl(int accno,double amount)
	{
		int k=0;
		int m=0;
		for(int i=0;i<5;i++)
		{
				if(accno==accounts[i].getAccno())
					{
						if(accounts[i].getBalance()>amount)
						{
							accounts[i].setBalance(accounts[i].getBalance()-amount);
							System.out.println("updated balance="+accounts[i].getBalance());
							m++;
						}
						try
						{ if(m!=1)
					throw new InsufficientAccountBalanceException();
				}
				catch(InsufficientAccountBalanceException e){
					System.out.println(e.getMessage());	
				}
						k++;
			}
				try
				{ if(k!=1)
					throw new InvalidAccountNumberException();
		}
			catch(InvalidAccountNumberException e){
				System.out.println(e.getMessage());	
			}
		}
		}
		
		void checkBalance(int accno)
		{
	int k=0;
				for(int i=0;i<5;i++)
				{
					
						if(accno==accounts[i].getAccno())
							{
							System.out.println("balance="+accounts[i].getBalance());
							k++;
							}
						try
						{ if(k!=1)
							throw new InvalidAccountNumberException();
						}
						catch(InvalidAccountNumberException e){
							System.out.println(e.getMessage());	
						}	
					}
				
		}

}



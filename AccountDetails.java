package codsoft_internship;
import java.util.Scanner;

class AccountDetails{
	String name,acct_no;
	double balance;
	Scanner inp=new Scanner(System.in);
		void withdraw() {
		System.out.println();
		System.out.println("withdrawing amount:");
		double withdraw = inp.nextDouble();
		
			if(balance>=withdraw) {
				balance=balance-withdraw;
				System.out.println("amount withdraw successfully!!");
				System.out.println("Balance after withdrawal: "+balance);
			}
			else {
				System.out.println("insufficient Funds!!check balance!!");
			}
		
		System.out.println();
		System.out.println();

	}
	 void deposit() {
		System.out.println();
		System.out.println("the depositing amount:");
		double deposit=inp.nextDouble();
		balance=balance+deposit;
		System.out.println("Balance After Deposit:"+balance);
		System.out.println();
		System.out.println();
	}
	 void BalanceCheck() {
		System.out.println();
		System.out.println("Total Balance:"+balance);
		System.out.println();
		System.out.println();
	}
	 void accountDetails() {
		System.out.println();
		System.out.println("***Customer Details:***");
		System.out.println("Name="+name);
		System.out.println("Account number="+acct_no);
		System.out.println("Balance="+balance);
		System.out.println();
	}

	public void DisplayOption() {
		System.out.println("The Options are:");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check Balance");
		System.out.println("4.Account Details");
		System.out.println("5.Exit");

	}
	void start() {
		int option;
		do {
		DisplayOption();
		System.out.println("Enter the choice:");
		option = inp.nextInt();
			switch(option) {
			case 1:
				withdraw();
				break;
			case 2:
				deposit();
				break;
			case 3:
				BalanceCheck();
				break;
			case 4:
				accountDetails();
				break;
			case 5:
				System.out.println("exiting..!!");
				break;
			default:
				System.out.println("enter valid option!!");
			}
			
		}while(option!=5);

	}
		public static void main(String args[]) {
			AccountDetails acc = new AccountDetails();
			Scanner s = new Scanner(System.in);
			System.out.println("Name:");
			String n = s.nextLine();
			System.out.println("Acct no.:");
			String acc_no = s.nextLine();
			System.out.println("Balance:");
			double balc = s.nextDouble();
			acc.name=n;
			acc.acct_no=acc_no;
			acc.balance=balc;
			acc.start();
			s.close();
			
		}

	}


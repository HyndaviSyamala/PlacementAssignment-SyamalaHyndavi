import java.util.Scanner;

public class JavaProject4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails customer[] = new BankingApplication[n];  
        for (int i = 0; i < customer.length; i++) {  
        	customer[i] = new BankingApplication();  
        	
        	System.out.println("Enter Account No: ");
    		String accNo = sc.next();
    		System.out.println("Enter Account type: ");
    		String accType = sc.next();
    		System.out.println("Enter Name: ");
    		String name = sc.next();
    		System.out.println("Enter Balance: Balance should we greater than 1000: ");
    		long balance = sc.nextLong();
        	
    		while(balance<1000) {
    			System.out.println("Amounmt should be greater than 1000");
    			balance = sc.nextLong();
    		}
    		
        	customer[i].openAccount(accNo,accType,name,balance);  
        }  
        // loop runs until number 5 is not pressed to exit  
        int choice;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            choice = sc.nextInt();  
                switch (choice) {  
                    case 1:  
                        for (int i = 0; i < customer.length; i++) {  
                        	customer[i].showAccountDetails();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. to show balance: ");  
                        String accNo = sc.next();  
                        long amount = 0;  
                        for (int i = 0; i < customer.length; i++) {  
                        	amount = customer[i].showBalance(accNo);  
                            if (amount!=-1) {  
                               System.out.println("Your Balance is: "+amount);
                               break;
                            } 
                            
                            //System.out.println("amount= "+amount);
                        }  
                        if (amount==-1) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        String accNo1 = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < customer.length; i++) {  
                            found = customer[i].search(accNo1);  
                            if (found) {  
                            	
                            	System.out.println("Enter the amount you want to deposit: ");
                        		long amt = sc.nextLong();
                            	
                                customer[i].deposit(amt);  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        String accNo2 = sc.next();  
                        found = false;  
                        for (int i = 0; i < customer.length; i++) {  
                            found = customer[i].search(accNo2);  
                            if (found) {  
                            	
                            	System.out.println("Enter the amount you want to withdraw: ");
                        		long amt = sc.nextLong();
                            	
                            	customer[i].withdrawal(amt);  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (choice != 5);  
         


	}

}

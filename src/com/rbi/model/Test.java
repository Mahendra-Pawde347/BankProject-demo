
package com.rbi.model;

import java.util.Scanner;

import com.cjc.operation.Operation;

public class Test {
	
public static void main(String[] args) 
{
	Operation o =new Operation();
	Scanner sc=new Scanner(System.in);
	
	while(true)
	{
	System.out.println();
	System.out.println();
	System.out.println("1. Create Account");
	System.out.println("2. Deposite Amount");
	System.out.println("3. Withdraw Amount");
	System.out.println("4. Balance Inquiry");
	System.out.println("5. Show Account Details");
	System.out.println("Enter a no");
	int s=sc.nextInt();
	
	switch (s) 
	{
	case 1: o.createAccount();
		break;
		
	case 2:	o.depositeMoney();
	   break;
	
	case 3:o.withdrawMoney();
	    break;
	    
	case 4: o.balanceInquiry();
	    break;
	    
	case 5:o.showAccountDetails();
	     break;

	default:
		break;
	}
}
}
}

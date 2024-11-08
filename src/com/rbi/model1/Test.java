package com.rbi.model1;

import java.util.Scanner;


import com.cjc.operation1.Operation1;

public class Test {
	
Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	Operation1 o1 =new Operation1();
	
	Scanner sc=new Scanner(System.in);
	while(true){
	System.out.println();
	System.out.println();
	System.out.println("1. Create Account");
	System.out.println("2. Deposite Amount");
	System.out.println("3. Withdraw Amount");
	System.out.println("4. Balance Inquiry");
	System.out.println("5. Transfer money");
	System.out.println("6. Show Account Details");
	System.out.println("Enter a no");
	int s=sc.nextInt();

switch (s) {
	
	case 1: o1.createAccount();
		break;
	case 2:o1.depositeMoney();
	break;
	
	case 3:o1.withdrawMoney();
	    break;
	case 4:o1.balanceInquiry();
	break;
		
	case 5:o1.transferMoney();
	break;
	
	case 6:o1.showAccountDetails();
	break;
	
	default:
		break;
	}
}
}
}
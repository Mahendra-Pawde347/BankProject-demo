

package com.cjc.operation;

import java.util.Scanner;

import com.cjc.Admin.Account;

public class Operation
{
	double bal=0.0;
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	
	public void createAccount()
	{
	System.out.println("Enter Account holder Details:");
	

	System.out.println("Enter customer name:-");
	String n=sc.next();
	a.setName(n);
	
	System.out.println("Enter customer Address:-");
	String ad=sc.next();
	a.setAddress(ad);
	
	System.out.println("Enter your account number"); 
	int an=sc.nextInt();
	a.setAccno(an);
	
	
	
	System.out.println("Enter ammount to create Account");
	double i=sc.nextDouble();
	bal=i;
	if(i>=500){
	
		System.out.println("Account successfully created");
		a.setMoney(i);
	}
	else
	{
		System.out.println("please enter amount greater than 500 to create account");
	}
	
}

public void depositeMoney()
{
	if(a.getAccno()==0)
		
	{
		System.out.println("First you must create your account");
	}
	else
	{
	
	System.out.println("Enter ammount you want to deposite");
	double d=sc.nextDouble();
	
	if(d>=0)
	{
		bal=d+a.getMoney();
		System.out.println("you have successfully deposited & balance is:-"+bal);
		a.setMoney(bal);
	}

}
}

public void withdrawMoney()
{
	if(a.getAccno()==0)
	{
		System.out.println("First you must create your account");
	}
	else{
	
	System.out.println("Enter withdraw ammount:");
	double w=sc.nextDouble();
	if(w>0){
	bal=bal-w;
	if(bal>=500)
	{ 
		System.out.println("You have successfully withdraw & your balance is"+bal);
		a.setMoney(bal);
	}
	
	
	else
	{
		
		System.out.println("Please enter a amount greater than 500");

	}
	}
}
}


public void balanceInquiry()
{
	if(a.getAccno()==0)
	{
		System.out.println("First you must create your account");
	}
	else{
	
	System.out.println("Your account balance is"+bal);
	}
}

public void showAccountDetails()
{
	System.out.println("Your Account number:-"+a.getAccno());

	System.out.println("Account Holder Name:-"+a.getName());
	

	
	System.out.println("Your address is:-"+a.getAddress());
	
}

}

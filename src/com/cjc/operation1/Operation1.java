
package com.cjc.operation1;

import java.util.Scanner;


import com.cjc.Admin1.Account1;

public class Operation1 {
	
 Scanner sc=new Scanner(System.in);
 Account1 [] acc=new Account1[5];
 
 int count=0;
 double bal=0.0;
 Boolean flag=false;
 public void createAccount()
 {
	 Account1 a=new Account1();
	 if(count<acc.length)
	 {
		 acc[count]=a;
		 count++;
	 
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
		double m=sc.nextDouble();
		
		if(m>=500){
		
			System.out.println("Account successfully created");
			a.setMoney(m);
		}
		else
		{
			System.out.println("please enter amount greater than 500 to create account");
		}
	 }
		else
		{
			System.out.println("Sorry,You can not enter value more than length");
		}
		
 }
 
 public void depositeMoney()
 {
	 boolean flag=true;
	 while(flag)
	 { 
	 for(int i=0;i<count;i++)
	 {
 	if(acc[i].getAccno()==0)	
 	{
 		System.out.println("First you must create your account");
 	}
 	else
 	{
 		System.out.println("Enter your account number");
 		int ac=sc.nextInt();
 		if(acc[i].getAccno()==ac)
 		{
 			System.out.println("Enter id:-");
 			String id=sc.next();
 			System.out.println("Enter passward:-");
 			String passd=sc.next();
 	System.out.println("Enter ammount you want to deposite");
 	double d=sc.nextDouble();	
 	if(d>=0)
 	{
 		bal=d+acc[i].getMoney();
 		System.out.println("you have successfully deposited & your balance is "+bal);
 		flag=false;
 		break;
 	}//3if
 	}//2if
 	}//1if
	 }//for
	 if(flag==false)
	 {
		 break;
	 }
 		else
 		{
 			System.out.println("Please enter correct account number");
 		}
	 
	 }//while
	 
 }//method
 
 public void withdrawMoney()
 {
	 boolean flag=true;
	 while(true)
	 {
	 
	 for(int i=0;i<count;i++)
	 {
 	if(acc[i].getAccno()==0)
 	{
 		System.out.println("First you must create your account");
 	}
 	else{
 		System.out.println("Please enter your account number");
 		int accno=sc.nextInt();
 		if(accno==acc[i].getAccno())
 		{
 	System.out.println("Enter id:-");
 	String id=sc.next();
 	System.out.println("Enter passward:-");
 	String passd=sc.next();
 	System.out.println("Enter withdraw ammount:");
 	double w=sc.nextDouble();
 	
 	if(w>0){
 	bal=acc[i].getMoney()-w;
 	if(bal>=500)
 	{ 
 		System.out.println("You have successfully withdraw & your balance is "+bal);
 		flag=false;
 		break;
 		
 	}//3if
 	else
 	{
 		System.out.println("Please enter a amount that your  balance will remain at least 500");
 	}
 	}
 	}
 	}
	 }//for
 		if(flag==false)
 		{
 			break;
 		}
 		else
 		{
 			System.out.println("Please enter correct account number");
 		}
 	}//while
	 }//method
	 
 public void balanceInquiry()
 {
	 boolean flag=true;
	 
	 while(flag)
	 {
	 for(int i=0;i<count;i++)
	 {
 	if(acc[i].getAccno()==0)
 	{
 		System.out.println("First you must create your account");
 	}
 	else{
 	
 		System.out.println("Please enter your account number");
 		int accno=sc.nextInt();
 		
 		if(accno==acc[i].getAccno())
 		{
 	
 	System.out.println("Your account balance is "+bal);
 	flag=false;
 	break;
 	}//if
 	}//else
 		
 	}//for
 	
 		if(flag==false)
 		{
 			break;
 		}
 		else
 		{
 			System.out.println("Enter correct Account number");
 		}
 		}//while
	 }//method
 
 public void transferMoney()
 {
	
	 System.out.println("Enter your account number to withdraw ");
	 	int accnos=sc.nextInt();
	 	 for(int i=0;i<count;i++)
			 
		 {
	 	if(accnos==acc[i].getAccno())
	 	{
	
	 		System.out.println("Enter account number to deposite");
		 	int accnor=sc.nextInt();
		 	
		for(int j=0;j<count;j++)
		{
	 	
	 	
	 	if(accnor==acc[j].getAccno())
	 	{
	 	System.out.println("Enter a ammount to transfer");
	 	double amt=sc.nextDouble();
	 	
	 	
	 	double Total=amt+acc[j].getMoney();
	 	acc[j].setMoney(Total);
	 	double am=acc[i].getMoney()-amt;
		if(am>=500)
	 	{
	 		System.out.println("sender's amount "+am);
	 		System.out.println("receiver's amount"+Total);//after depositing amount 
	 	}
	 	}
		}//for2
		
	 	}
	 
	 	else{System.out.println("enter corr acc no");}
 }
 }
 
	 
	
	 	
	 	
 
 

 public void showAccountDetails()
 
 { boolean flag=true;
 while(flag)
 {
	
	 System.out.println("Please enter your account number");
	 int accno=sc.nextInt();
	 
	 for(int i=0;i<count;i++)
	 {
	if(accno==acc[i].getAccno())
	{
	 
		System.out.println("Your Account number:-"+acc[i].getAccno());

				System.out.println("Account Holder Name:-"+acc[i].getName());
				

				
				System.out.println("Your address is:-"+acc[i].getAddress());
				flag=false;
				
				break;
 
	}//if
	
	 }//for

	 if(flag==false)
	 {
		break;
		 
	 }
	 else
	 {
		 System.out.println("Enter correct account number");
	 }
	 }//while
	 
 }//method
}//class
	
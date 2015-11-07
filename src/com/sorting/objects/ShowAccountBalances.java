package com.sorting.objects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import bankInfo.Account;
import bankInfo.Customer;
import accountdb.BankingDatabase;


public class ShowAccountBalances {
	
	public static void main(String args[]) { 
		
		BankingDatabase bankingDb = new BankingDatabase();
		 Customer customer = bankingDb.getCustomerInfo();
		List<Account> accounts= customer.getAccounts();
		for(int accountIndex = 0 ; accountIndex < accounts.size(); accountIndex ++) { 
			System.out.println("Account Balance is " + accounts.get(accountIndex).getBalance());
			
		}
		Collections.sort(accounts, new AccountBalanceComparator());
		System.out.println("********************************");
		for(int accountIndex = 0 ; accountIndex < accounts.size(); accountIndex ++) { 
			System.out.println("Account Balance is " + accounts.get(accountIndex).getBalance());
			
		}
		 
		
		
	}

}

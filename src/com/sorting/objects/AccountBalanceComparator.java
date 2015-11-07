package com.sorting.objects;
import java.util.Comparator;

import bankInfo.Account;


public class AccountBalanceComparator implements Comparator<Account> {

	
	public int compare(Account account1, Account account2) {
		double accountBalanceFirst = account1.getBalance();
		double accountBalancetwo =  account2.getBalance();
		 int sortedBalance = (int) (accountBalanceFirst - accountBalancetwo);
		 return sortedBalance;
		
	}


	

}

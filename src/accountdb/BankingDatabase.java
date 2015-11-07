package accountdb;

import java.util.ArrayList;
import java.util.List;

import bankInfo.Account;
import bankInfo.Address;
import bankInfo.Bank;
import bankInfo.Customer;
import bankInfo.Employee;



public class BankingDatabase {
	
	
	public static void main(String args[]) { 
			
//		Customer customer =	getCustomerInfo();
//				Bank myBank = getBankInfo();
//			
	}
	
	public  static Bank getBankInfo() {
		
		
		Bank  mybank = new Bank(); 
		mybank.setBankName("Bank of Danish");
		mybank.setBanktype("Home lender");
		mybank.setLocation("Dallas");
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Employee emp1= new Employee();
		emp1.setName("Danish");
		emp1.setEmpId("1");
		emp1.setSsn("111-22-2222");
		emp1.setDesignation("CEO");
		emp1.setWeekdayOffs(10);
		employees.add(emp1);
		
		Employee emp2= new Employee();
		emp2.setName("Ali");
		emp2.setEmpId("2");
		emp2.setSsn("222-22-2222");
		emp2.setDesignation("Manager");
		emp2.setWeekdayOffs(4);
		employees.add(emp2);
		
		Employee emp3= new Employee();
		emp3.setName("Mark");
		emp3.setEmpId("3");
		emp3.setSsn("333-22-2222");
		emp3.setDesignation("Teller");
		emp3.setWeekdayOffs(4);
		employees.add(emp3);
		
		Employee emp4= new Employee();
		emp4.setName("Edward");
		emp4.setEmpId("4");
		emp4.setSsn("444-22-2222");
		emp4.setDesignation("FInancial Officer");
		emp4.setWeekdayOffs(7);
		employees.add(emp4);
		
		Employee emp5= new Employee();
		emp5.setName("Samh");
		emp5.setEmpId("5");
		emp5.setSsn("555-22-2222");
		emp5.setDesignation("Loan Specialist");
		emp5.setWeekdayOffs(5);
		
		employees.add(emp5);
		
		
		
		
		
		mybank.setEmployee(employees);
		 return mybank;
		
		
		
	}

	public static Customer getCustomerInfo() {
		
		Customer customer = new Customer();
		
		customer.setName("Iftikar Ali");
		customer.setPhone("214-989-9000");
		customer.setSsn("111=11-1111");
		
			Address address = new Address(); 
			address.setCity("Richardson");
			address.setStreetname("Oak Street" );
			address.setZipcode("75044");
			address.setState("Tx");
		customer.setAddress(address);
		
		Account checkingaccount = new Account();
		checkingaccount.setAccountno("11111111");
		checkingaccount.setAccountType("checking");
		checkingaccount.setBalance(180);
		
		Account savingaccount = new Account();
		savingaccount.setAccountno("22222222");
		savingaccount.setAccountType("savings");
		savingaccount.setBalance(90);
		
		
		Account homeloan = new Account();
		homeloan.setAccountno("22222222");
		homeloan.setAccountType("savings");
		homeloan.setBalance(60);
		
		
		
		Account stocksLoan = new Account();
		stocksLoan.setAccountno("22222222");
		stocksLoan.setAccountType("savings");
		stocksLoan.setBalance(50);
		
		
		
		
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(checkingaccount);
		accounts.add(savingaccount);
		accounts.add(homeloan);
		accounts.add(stocksLoan);
		
		customer.setAccounts(accounts);
		System.out.println ("End of Banking db ");
		
		
		
		
		
		
		return customer;
	}
	
	
	
	
public static List<Customer> getAllCustomerInfo() {
		
	 List<Customer> customers = new ArrayList<Customer>();
 	
		Customer customerone = new Customer();
		customerone.setName("Iftikar Ali");
		customerone.setPhone("214-989-9000");
		customerone.setSsn("111=11-1111");
		Address address = new Address(); 
			address.setCity("Richardson");
			address.setStreetname("Oak Street" );
			address.setZipcode("75044");
			address.setState("Tx");
		customerone.setAddress(address);
		
		Account checkingaccount = new Account();
		checkingaccount.setAccountno("11111111");
		checkingaccount.setAccountType("checking");
		checkingaccount.setBalance(180);
		
		Account savingaccount = new Account();
		savingaccount.setAccountno("22222222");
		savingaccount.setAccountType("savings");
		savingaccount.setBalance(90);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(checkingaccount);
		accounts.add(savingaccount);
		
		customerone.setAccounts(accounts);
		
		customers.add(customerone); //Aded to List
		
		
		
		Customer customerTwo = new Customer();
		customerTwo.setName("Danish");
		customerTwo.setPhone("214-997-9000");
		customerTwo.setSsn("222-11-1111");
		Address addressTwo = new Address(); 
		addressTwo.setCity("Richardson");
		addressTwo.setStreetname("Oak Street" );
		addressTwo.setZipcode("75044");
		addressTwo.setState("Tx");
		customerTwo.setAddress(address);
		
		Account checkingaccount2 = new Account();
		checkingaccount2.setAccountno("11111111");
		checkingaccount2.setAccountType("checking");
		checkingaccount2.setBalance(180);
		
		Account savingaccount2 = new Account();
		savingaccount2.setAccountno("22222222");
		savingaccount2.setAccountType("Home Loan");
		savingaccount2.setBalance(1000);
		
		ArrayList<Account> accountscustomer2 = new ArrayList<Account>();
		accountscustomer2.add(checkingaccount2);
		accountscustomer2.add(savingaccount2);
		customerTwo.setAccounts(accountscustomer2);
		
		customers.add(customerTwo);
		
		
		
		
		
		
		System.out.println ("End of Banking db ");
		return customers;
	}
	
	
	

}

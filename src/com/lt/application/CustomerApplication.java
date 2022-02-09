package com.lt.application;

import java.util.Scanner;

import com.lt.business.CustomerBusiness;

public class CustomerApplication {

	public static void main(String[] args) {
		// create instance of business class

		CustomerBusiness cb = new CustomerBusiness();
		cb.createCustomer();
		// cb.deleteCustomer();
		// cb.updateCustomer();
		cb.listCustomer();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = s.nextInt();
		System.out.println("Enter customerID");
		int CustomerId = s.nextInt();
		switch (choice) {
		case 1:
			cb.updateCustomer(CustomerId);
			break;
		case 2:
			cb.deleteCustomer(CustomerId);
			break;
		default:
			break;
		}

	}

}

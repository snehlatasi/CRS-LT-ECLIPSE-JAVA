package com.lt.business;

import com.lt.bean.Customer;

public class CustomerBusiness {
	Customer customers[] = new Customer[5];

	// Define the business method inside this class

	public void createCustomer() {
		// adding customer list
		customers[0] = new Customer();
		customers[0].setCustomerId(101);
		customers[0].setCustomerName("Sneha");
		customers[0].setCustomerAddress("Delhi");

		// adding second list
		customers[1] = new Customer();
		customers[1].setCustomerId(102);
		customers[1].setCustomerName("Diya");
		customers[1].setCustomerAddress("UP");

		// adding third list
		customers[2] = new Customer();
		customers[2].setCustomerId(103);
		customers[2].setCustomerName("Anil");
		customers[2].setCustomerAddress("Pune");

		customers[3] = new Customer();
		customers[3].setCustomerId(104);
		customers[3].setCustomerName("Sunny");
		customers[3].setCustomerAddress("Munbai");

		customers[4] = new Customer();
		customers[4].setCustomerId(105);
		customers[4].setCustomerName("Raj");
		customers[4].setCustomerAddress("Goa");

		System.out.println("Customer is created");
	}

	public void deleteCustomer(int CustomerId) {
		int j = 0;
		Customer newCust[] = new Customer[customers.length - 1];
		for (Customer cust : customers) {
			if (cust != null && cust.getCustomerId() != CustomerId) {
				newCust[j++] = cust;
			}
		}
		customers = newCust;
		for (Customer c : newCust) {
			System.out.println("details of Customer--> " + c.getCustomerId()
					+ " " + c.getCustomerName() + " " + c.getCustomerAddress());
		}
		System.out.println("Customer is deleted");
	}

	public void updateCustomer(int CustomerId) {
		for (Customer customer : customers) {
			if (CustomerId == customer.getCustomerId()) {
				customer.setCustomerName("Snehlata");
				customer.setCustomerAddress("Noida");
				System.out.println("details of Customer--> "
						+ customer.getCustomerId() + " "
						+ customer.getCustomerName() + " "
						+ customer.getCustomerAddress());
			}
		}
		System.out.println("customer is updated");

	}

	public void listCustomer() {
		// List Customer Logic
		for (Customer cust : customers) {
			// System.out.println("details of Customer-->" +cust.getCustId() +
			// "" +cust.getCustName()+ "" +cust.getAddress());

			System.out.println("details of Customer--> " + cust.getCustomerId()
					+ "" + cust.getCustomerName() + ""
					+ cust.getCustomerAddress());
		}

		System.out.println("Customer is displayed");
	}

}

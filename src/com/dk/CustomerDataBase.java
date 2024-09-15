package com.dk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDataBase {

	public List<Customer> getAllCustomer() {
		List<Customer> customerList = new ArrayList();
		customerList.add(new Customer(1, "DK", "DKDINESH.89KUMAR@GMAIL.COM", Arrays.asList("123456780", "234567890")));
		customerList.add(new Customer(1, "AB", "ABHISEKRAI@GMAIL.COM", Arrays.asList("234856788888", "9876540834")));
		customerList.add(new Customer(1, "MSD", "MAHESH@GMAIL.COM", Arrays.asList("234856788888", "9876540834","456807833434")));
		return customerList;
	}

}

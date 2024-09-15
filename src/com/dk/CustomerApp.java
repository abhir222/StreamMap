package com.dk;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerApp {

	public static void main(String[] args) {

		CustomerDataBase detail = new CustomerDataBase();
		List<Customer> customerList = detail.getAllCustomer();

		List<String> nameCollection = customerList.stream().map(c -> c.getEmpName() + " From Banglore")
				.collect(Collectors.toList());
		System.out.println(nameCollection);
		System.out.println("Before flatMap() Result: ");
		List<List<String>> collect = customerList.stream().map(c -> c.getMobileNumbers()).collect(Collectors.toList());
		System.out.println(collect);
		List<String> allMobileNumbers = collect.stream().flatMap(c -> c.stream()).collect(Collectors.toList());
		System.out.println("After flatMap() Result: ");
		System.out.println(allMobileNumbers);
	}

}

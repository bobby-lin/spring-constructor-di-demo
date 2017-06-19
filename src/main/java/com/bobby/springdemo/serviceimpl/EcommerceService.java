package com.bobby.springdemo.serviceimpl;

import java.util.Random;

import com.bobby.springdemo.service.BusinessService;

public class EcommerceService implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = companyName + " offers world class Ecommerce platform."
				+ "The annual income exceeds" + random.nextInt(revenue);
		return service;
	}

}

package com.bobby.springdemo.serviceimpl;

import java.util.Random;

import com.bobby.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruit) {
		Random random = new Random();
		String hiringFacts = companyName + "'s " + departmentName + " hired " + 
		random.nextInt(numberOfRecruit) + " employees using various agencies.";
		return hiringFacts;
	}

}

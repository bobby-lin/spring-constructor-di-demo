package com.bobby.springdemo.domain;

import com.bobby.springdemo.service.RecruitmentService;

public class HumanResourceDept implements Department {
	
	private String deptName;
	private RecruitmentService recruitmentService;
	private Organization organization;
	
	public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(), 
				deptName, numOfRecruitments);
		return hiringFacts;
	}

}

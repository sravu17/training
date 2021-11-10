package com.ibm.emp;

public class Manager extends Employee {
	private double commission;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int empNo, String empName, double salary,double commission) {
		super(empNo,empName,salary);
		this.commission = commission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commision:" + commission);
	}

	@Override
	public double getSalary() {
		
		return super.getSalary()+ commission;
	}

	
	}

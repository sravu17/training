package com.ibm.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.repo.EmpDeptRepo;

public class TestEmpDept {
private static EmpDeptRepo repo;

@BeforeAll
public static void init() {
	repo = new EmpDeptRepo();
}
@Test
public void testSaveDept() {
	Department dept = new Department();
	dept.setDeptName("Sales");
	dept.setDeptNo(21);
	repo.saveDept(dept);
}
@Test
public void testSaveEmp() {
	Employee emp = new Employee();
	emp.setEmpNo(202);
	emp.setEmpName("Kate");
	emp.setSalary(5500);
	repo.saveEmp(emp, 21);
	
}

@Test
public void testGetDept() {
	Department dept = repo.getDept(21);
	System.out.println("Department " + dept.getDeptNo() + " " +  dept.getDeptName());
	System.out.println(dept.getEmps());
}

@Test
public void testGetEmp() {
	Employee emp = repo.getEmp(202);
	System.out.println("Employee " + emp.getEmpNo() + " " + emp.getEmpName());
	
}

@Test
public void testGetAllEmp() {
	List<Employee> list= repo.getAllEmp();
	for (Employee employee : list) {
		System.out.println(employee.getEmpNo() + " " + employee.getEmpName());
	}
}

@Test
public void testGetAllDept() {
	List<Department> list = repo.getAllDept();
	for (Department dept : list)
	System.out.println(dept.getDeptNo()+" "+ dept.getDeptName());
}
@Test
public void TestDelDept() {
	repo.deleteDept(20);
}

}

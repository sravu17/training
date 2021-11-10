package com.ibm.service;

import java.util.List;

import com.ibm.model.Students;

public interface StudentService {
	
	void save(Students s);

	Students fetch(int rollNo);

	List<Students> fetchAll();
}

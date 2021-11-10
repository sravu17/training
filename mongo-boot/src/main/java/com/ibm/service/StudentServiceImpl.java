package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Students;
import com.ibm.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void save(Students s) {
		repo.save(s);
	}

	@Override
	public Students fetch(int rollNo) {
		return repo.findById(rollNo).get();
	}

	@Override
	public List<Students> fetchAll() {
		
		return repo.findAll();
	}

}

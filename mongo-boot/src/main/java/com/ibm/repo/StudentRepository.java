package com.ibm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.model.Students;

public interface StudentRepository extends MongoRepository<Students, Integer>
{

}

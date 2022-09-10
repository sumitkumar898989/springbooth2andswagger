package com.javatpoint.repository;  
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.model.Student; 

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
}  
package com.student.ete.repo;

import org.springframework.data.repository.CrudRepository;

import com.student.ete.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}

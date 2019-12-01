package com.student.ete;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.student.ete.entities.Student;
import com.student.ete.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {

	@Autowired
	private StudentRepository studentRepo;
	
	@Test
	public void testCreateStudent() {
		Student stu = new Student();
		
		stu.setsName("venky");
		stu.setFee(1012.34);
		stu.setsCourse("springBoot");
		
		studentRepo.save(new Student());
	}
	
	@Test
	public void findByStudentId() {
		Student student = studentRepo.findById(1).get();
		System.out.println(student);
	}
	@Test
	public void updateSfee() {
		Student student = studentRepo.findById(1).get();
		student.setFee(1546.3);
		 studentRepo.save(student);
	}
	@Test
	public void testDeleteStudent() {
		studentRepo.deleteById(1);
	}
	//we can also delete using student object by setting Id
	/*
	 * @Test public void testDeleteStudentObj() { 
	 * Student st = new Student();
	 * st.setsId(1); studentRepo.deleteById(1); }
	 */
}

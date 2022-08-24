package com.cg.client;
import com.cg.entity.Student;
import com.cg.services.StudentService;
import com.cg.services.StudentServiceImpl;


public class Client {
public static void main(String[] args) {
	
//Debug this program as Debug -> Debug as Java Application
StudentService service = new StudentServiceImpl();
Student student = new Student();
// CRUD Operations

// Create Operation
//
student.setStudentid(10);
student.setName("Pavan");
service.addStudent(student);

//at this breakpoint, we have added one record to table

// Retrieve Operation
//student = service.findStudentById(100);
//System.out.print("ID:"+student.getStudentId());
//System.out.println(" Name:"+student.getName());

//// Update Operation
//student = service.findStudentById(100);
//student.setName("Sachin Tendulkar");
//service.updateStudent(student);

////at this breakpoint, we have updated record added in first section

//student = service.findStudentById(100);
//System.out.print("ID:"+student.getStudentId());
//System.out.println(" Name:"+student.getName());

////at this breakpoint, record is removed from table

//// Delete Operation
//student = service.findStudentById(0);
//service.removeStudent(student);
System.out.println("End of program/Life cycle completed...");
}
}

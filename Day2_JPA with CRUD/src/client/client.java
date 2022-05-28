package client;

import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class client 
{
	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		//CRUD Operation
		student.setID(45);
		student.setName("Gagana");
		service.addStudent(student);
		
		/*/Retrieve data-find();
		student=service.findStudentById(21);
		System.out.println("ID: "+student.getID());
		System.out.println("Name: "+student.getName());*/
		
		
		//update
		student=service.findStudentById1(24);
		student.setName("bbb");
		service.updateStudent(student);
		
		
		
		/*/delete
				student=service.findStudentById(24);
				service.removeStudent(student);*/
	}

}

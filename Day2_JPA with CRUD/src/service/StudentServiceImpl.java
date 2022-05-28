package service;

import dao.StudentDao;
import dao.StudentDaoImplementation;
import entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;

	public StudentServiceImpl() {
		
		dao=new StudentDaoImplementation();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student findStudentById1(int ID) {
		Student student =dao.getStudentById(ID);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
}

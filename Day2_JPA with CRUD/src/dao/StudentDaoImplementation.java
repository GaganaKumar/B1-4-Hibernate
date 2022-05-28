package dao;

import javax.persistence.EntityManager;

import entities.Student;

public class StudentDaoImplementation implements StudentDao 
{
	private EntityManager entityManager;
	
	public StudentDaoImplementation() 
	{
		entityManager=JPAUtil.getEntityManager();
		
	}

	@Override
	public void addStudent(Student student) 
	{
		entityManager=JPAUtil.getEntityManager();
		
	}

	@Override
	public Student getStudentById(int ID) 
	{
		Student student =entityManager.find(Student.class,ID);
		return student;
	}

	@Override
	public void updateStudent(Student student) 
	{
		entityManager.merge(student);
		
	}

	@Override
	public void removeStudent(Student student) 
	{
		entityManager.remove(student);
		
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}

}

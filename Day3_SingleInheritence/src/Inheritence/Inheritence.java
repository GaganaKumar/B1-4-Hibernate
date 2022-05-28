package Inheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritence {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp=new Employee();
		emp.setName("Gagana");
		emp.setSalary(35000);
		em.persist(emp);
		
		//create one manager
		Manager manager=new Manager();
		manager.setDeptName("Shreya");
		manager.setSalary(50000);
		manager.setDeptName("Program Specialist");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("added one emp and one manager");
		em.close();
		factory.close();

	}

}

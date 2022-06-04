package Repository;

import javax.persistence.EntityManager;



import Entity.Employee;



public class IEmployeeRepositoryimpl implements IEmployeeRepository

{

	//Start JPA LifeCycle

	private EntityManager entityManager;

	public IEmployeeRepositoryimpl() 

	{

		entityManager=JPAUtil.getEntityManager();

	}

	//Create operation - Repo/DAO

	@Override

	public Employee addEmployee(Employee employee) {

		entityManager.persist(employee);

		return employee;

	}

	//Update operation

	@Override

	public Employee updateEmployee(Employee employee) {

		entityManager.merge(employee);

		return employee;

	}

	//Retrieve operation

	@Override

	public Employee searchEmployee(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		return employee;

	}

	//Delete operation

	@Override

	public boolean deleteEmployee(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		entityManager.remove(employee);

		return false;

	}



	@Override

	public void beginTransaction() {

		entityManager.getTransaction().begin();			

	}



	@Override

	public void commitTransaction() {

		entityManager.getTransaction().commit();			

	}

	

}
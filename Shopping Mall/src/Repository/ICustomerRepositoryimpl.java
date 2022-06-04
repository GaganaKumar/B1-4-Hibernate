package Repository;

import javax.persistence.EntityManager;



import Entity.Customer;



public class ICustomerRepositoryimpl implements ICustomerRepository

{

	//Start JPA LifeCycle

	private EntityManager entityManager;

	public ICustomerRepositoryimpl() 

	{

		entityManager=JPAUtil.getEntityManager();

	}

	//Create operation - Repo/DAO

	@Override

	public Customer addCustomer(Customer customer) {

		entityManager.persist(customer);

		return customer;

	}

	//Update operation

	@Override

	public Customer updateCustomer(Customer customer) {

		entityManager.merge(customer);

		return customer;

	}

	//Retrieve operation

	@Override

	public Customer searchCustomer(int id) {

		Customer customer = entityManager.find(Customer.class, id);

		return customer;

	}

	//Delete operation

	@Override

	public void deleteCustomer(int id) {

		Customer customer = entityManager.find(Customer.class, id);

		entityManager.remove(customer);

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

	


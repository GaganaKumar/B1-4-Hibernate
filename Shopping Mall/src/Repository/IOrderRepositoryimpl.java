package Repository;

import javax.persistence.EntityManager;



import Entity.OrderDetail;



public class IOrderRepositoryimpl implements IOderRepository

{

	//Start JPA LifeCycle

	private EntityManager entityManager;

	public IOrderRepositoryimpl() 

	{

		entityManager=JPAUtil.getEntityManager();

	}

	//Create operation - Reno/DAO

	public OrderDetail addOrder(OrderDetail order) {

		entityManager.persist(order);

		return order;

	}

	//Update operation

	public OrderDetail updateOrder(OrderDetail order) {

		entityManager.merge(order);

		return order;

	}

	//Retrieve operation

	public OrderDetail searchOrderById(int id) {

		OrderDetail order = entityManager.find(OrderDetail.class, id);

		return order;

	}

	//Delete operation

	public OrderDetail deleteOrder(int id) {

		OrderDetail order = entityManager.find(OrderDetail.class, id);

		entityManager.remove(order);

		return order;

	}



	public void beginTransaction() {

		entityManager.getTransaction().begin();	

	}



	public void commitTransaction() {

		entityManager.getTransaction().commit();		

	}



}
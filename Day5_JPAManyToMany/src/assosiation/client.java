package assosiation;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class client {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();



		product mobile1 = new product();
		mobile1.setId(1);
		mobile1.setName("Samsung");
		mobile1.setPrice(55000);

		product mobile2 = new product();
		mobile2.setId(2);
		mobile2.setName("Iphone 13");
		mobile2.setPrice(180000);

		product mobile3 = new product();
		mobile3.setId(3);
		mobile3.setName("Mi note 11");
		mobile3.setPrice(15000);

		product mobile4 = new product();
		mobile4.setId(4);
		mobile4.setName("Vivo v15");
		mobile4.setPrice(25000);


		order firstOrder = new order();
		firstOrder.setId(1000);
		firstOrder.setPurchaseDate(new Date());

		firstOrder.addProduct(mobile3);
		firstOrder.addProduct(mobile1);
		firstOrder.addProduct(mobile2);

		order secondOrder = new order();
		secondOrder.setId(1001);
		secondOrder.setPurchaseDate(new Date());

		secondOrder.addProduct(mobile3);		
		secondOrder.addProduct(mobile1);
		secondOrder.addProduct(mobile4);


		em.persist(firstOrder);
		em.persist(secondOrder);
		
		System.out.println("Added orders to db");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}


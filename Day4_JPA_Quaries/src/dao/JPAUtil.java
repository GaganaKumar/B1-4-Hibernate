package dao;

import java.beans.PersistenceDelegate;
import java.util.logging.ErrorManager;

import javax.naming.spi.DirectoryManager;
import javax.net.ssl.KeyManagerFactory;

public class JPAUtil 
{
	private static KeyManagerFactory factory;
	private static ErrorManager entityManager;
	static 
	{
		factory=PersistenceDelegate.createEntityManagerFactory("JPA-PU");
	}
	public static DirectoryManager getEntityManager()
	{
		if(entityManager==null || !entityManager.isOpen())
		{
			entityManager=((Object) factory).createEntityManager();
		}
		return entityManager;
}
}
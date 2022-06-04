package Service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public abstract class IShopService<Employee, Shop>
	{
		abstract Shop addShop(Shop shop);
		//@SuppressWarnings("retypes")
		abstract Shop updateShop(Shop shop);
		//@SuppressWarnings("retypes")
		abstract Shop searchShopById(int ID);
		abstract Boolean addEmployee(Employee employee);
		abstract Boolean updateEmployee(Employee employee);
		abstract Boolean deleteEmployee(long id);
		abstract Item addItem(Item item);
	}

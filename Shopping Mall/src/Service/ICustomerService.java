package Service;

import java.util.List;



import Entity.Item;

import Entity.Mall;

import Entity.User;



public interface ICustomerService 

{

	public abstract List<Item>searchItem(String itemName);

	public abstract Item orderItem(Item item);

	public abstract Mall searchMall(int id);

	public abstract boolean cancelOrder(int orderId);

	public abstract User login(User user);

	public abstract boolean logOut();

}
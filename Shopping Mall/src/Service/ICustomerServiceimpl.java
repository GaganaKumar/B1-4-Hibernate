package Service;

import java.util.List;



import Entity.Item;

import Entity.Mall;

import Entity.User;

import Repository.ICustomerRepository;

import Repository.ICustomerRepositoryimpl;



public class ICustomerServiceimpl implements ICustomerService

{

	//Establishing connection between Service and Repository

	private ICustomerRepository dao1;

	public ICustomerServiceimpl()

	{

		dao1 = new ICustomerRepositoryimpl();

	}

	@Override

	public List<Item> searchItem(String itemName) {

		return ((ICustomerServiceimpl) dao1).searchItem(itemName);

	}



	@Override

	public Item orderItem(Item item) {

		return ((ICustomerServiceimpl) dao1).orderItem(item);

	}



	@Override

	public Mall searchMall(int id) {

		return ((ICustomerServiceimpl) dao1).searchMall(id);

	}



	@Override

	public boolean cancelOrder(int orderId) {

		return ((ICustomerServiceimpl) dao1).cancelOrder(orderId);

	}



	@Override

	public User login(User user) {

		dao1.beginTransaction();

		((IUserServiceImplementation) dao1).login(user);

		dao1.commitTransaction();

		return user;

	}



	@Override

	public boolean logOut() {

		dao1.beginTransaction();

		((IUserServiceImplementation) dao1).logOut();

		dao1.commitTransaction();

		return false;

	}

	

}
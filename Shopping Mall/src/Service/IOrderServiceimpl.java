package Service;

import Entity.Item;

import Entity.OrderDetail;

import Repository.IItemRepository;
import Repository.IOderRepository;
import Repository.IOrderRepositoryimpl;

public abstract class IOrderServiceimpl implements IOrderService 

{

	//Establishing connection between Service and Repository

	private IOderRepository dao3;	

	public IOrderServiceimpl()

	{

		dao3 = new IOrderRepositoryimpl();

	}



	@Override

	public OrderDetail addOrder(OrderDetail order) {

		dao3.beginTransaction();

		dao3.addOrder(order);

		dao3.commitTransaction();

		return order;

	}



	@Override

	public OrderDetail updateOrder(OrderDetail order) {

		dao3.beginTransaction();

		dao3.updateOrder(order);

		dao3.commitTransaction();

		return order;

	}



	@Override

	public OrderDetail searchOrderById(int id) {

		OrderDetail order = dao3.searchOrderById(id);

		return order;

	}



	@Override

	public boolean cancelMall(int id) {

		dao3.beginTransaction();

		((IOrderServiceimpl) dao3).cancelMall(id);

		dao3.commitTransaction();

		return false;

	}



	@Override

	public Item addItem(Item item) {

		dao3.beginTransaction();

		((IItemRepository) dao3).addItem(item);

		dao3.commitTransaction();

		return item;

	}



}

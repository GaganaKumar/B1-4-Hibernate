package Service;

import Entity.Item;

import Entity.OrderDetail;

public interface IOrderService 

{

	public abstract OrderDetail addOrder(OrderDetail order);

	public abstract OrderDetail updateOrder(OrderDetail order);

	public abstract OrderDetail searchOrderById(int id);

	public abstract boolean cancelMall(int id);

	public abstract Item addItem(Item item);

}

package Repository;


import Entity.OrderDetail;


public interface IOderRepository 

{

	public abstract OrderDetail addOrder(OrderDetail order);

	public abstract OrderDetail updateOrder(OrderDetail order);

	public abstract OrderDetail searchOrderById(int id);

	public abstract OrderDetail deleteOrder(int id);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
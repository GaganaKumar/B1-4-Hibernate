package Repository;

import Entity.Shop;

public interface IShopOwnerRepository 
{
	public Shop addShopOwner(Shop shop);
	public Shop updateShopOwner(Shop shop);
	public Shop searchShopOwner(int id);
	public Shop deleteShopOwner(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
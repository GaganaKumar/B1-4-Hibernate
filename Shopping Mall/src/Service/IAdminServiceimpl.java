package Service;

import Entity.Shop;
import Entity.User;
import Repository.IMallAdminRepository;

import Repository.IMallAdminRepositoryimpl;



public abstract class IAdminServiceimpl implements IAdminService 

{

	//Establishing connection between Service and Repository

	private IMallAdminRepository dao;

	public IAdminServiceimpl()

	{

		dao = new IMallAdminRepositoryimpl();

	}

	//Service calls to perform CRUD operation

	@Override

	public boolean approveNewShop(Shop shop) {

		dao.beginTransaction();

		((IAdminServiceimpl) dao).approveNewShop(shop);

		dao.commitTransaction();

		return false;

	}



	@Override

	public User updateUser(User user) {

		dao.beginTransaction();

		((IAdminServiceimpl) dao).updateUser(user);

		dao.commitTransaction();

		return user;	

	}



	@Override

	public User login(User user) {

		dao.beginTransaction();

		((IAdminServiceimpl) dao).login(user);

		dao.commitTransaction();	

		return user;

	}



	@Override

	public boolean logOut() {

		dao.beginTransaction();

		((IAdminServiceimpl) dao).logOut();

		dao.commitTransaction();

		return false;

	}



}
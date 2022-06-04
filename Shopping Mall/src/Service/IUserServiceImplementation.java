package Service;

import Entity.User;

import Repository.IUserRepository;

import Repository.IUserRepositoryimpl;



public class IUserServiceImplementation implements IUserService

{

	//Establishing connection between Service and Repository

	private IUserRepository dao5;

	

	public IUserServiceImplementation()

	{

		dao5 = new IUserRepositoryimpl();

	}

	

	//Service calls to perform CRUD operation

	@Override

	public User addNewUser(User user) {

		dao5.beginTransaction();

		dao5.addNewUser(user);

		dao5.commitTransaction();

		return user;

	}



	@Override

	public User updateUser(User user) {

		dao5.beginTransaction();

		dao5.updateUser(user);

		dao5.commitTransaction();

		return user;

	}



	@Override

	public User login(User user) {

		dao5.beginTransaction();

		((IUserServiceImplementation) dao5).login(user);

		dao5.commitTransaction();

		return user;

	}



	@Override

	public boolean logOut() {

		dao5.beginTransaction();

		((IUserServiceImplementation) dao5).logOut();

		dao5.commitTransaction();

		return false;

	}



}
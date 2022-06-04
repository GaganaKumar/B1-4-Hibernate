package Service;

import Entity.Employee;

public interface IEmployeeService 

{

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee searchEmployee(int id);

	public abstract boolean deleteEmployee(int id);

}
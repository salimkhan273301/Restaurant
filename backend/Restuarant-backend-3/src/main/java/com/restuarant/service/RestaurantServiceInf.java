package com.restuarant.service;

import java.util.List;

import com.restuarant.entity.Admin;
import com.restuarant.entity.Customer;
import com.restuarant.entity.EntityInterface;
import com.restuarant.entity.HeadChef;
import com.restuarant.entity.Item;
import com.restuarant.entity.Orders;
import com.restuarant.entity.Supervisor;
import com.restuarant.login.LoginHelper;

public interface RestaurantServiceInf {
	
	public EntityInterface LoginService(LoginHelper loginHelp);

	public boolean deleteSupervisor(Integer sId);
	public List<Supervisor> getSupervisors();
	public boolean addSupervisor(Supervisor supervisor);


	public boolean addChef(HeadChef chef);
	public List<HeadChef> getChef();
	public boolean deleteChef(Integer cId);
	
	public boolean additem(Item item);
	public boolean deleteItem(Item item);
	
	public boolean addAdmin(Admin admin);
	
	public List<Item> getItem();
	public void served(int oId);
	public List<Orders> allOrders();
	public void modify(int iId);

	public boolean addCustomer(Customer customer);
	public List<Customer> getCustomer();
	public boolean deleteCustomer(Integer cId);

}

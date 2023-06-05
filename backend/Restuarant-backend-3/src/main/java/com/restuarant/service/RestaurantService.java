package com.restuarant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restuarant.dao.AdminDao;
import com.restuarant.dao.CartDao;
import com.restuarant.dao.CustomerDao;
import com.restuarant.dao.HeadChefDao;
import com.restuarant.dao.ItemDao;
import com.restuarant.dao.OrderDao;
import com.restuarant.dao.SupervisorDao;
import com.restuarant.entity.Admin;
import com.restuarant.entity.Customer;
import com.restuarant.entity.EntityInterface;
import com.restuarant.entity.HeadChef;
import com.restuarant.entity.Item;
import com.restuarant.entity.Orders;
import com.restuarant.entity.Supervisor;
import com.restuarant.login.LoginHelper;

@Service
public class RestaurantService implements RestaurantServiceInf {
	
	@Autowired
	private AdminDao aDao;
	
	@Autowired
	private HeadChefDao hDao;
	
	@Autowired
	private SupervisorDao sDao;
	
	@Autowired
	private CustomerDao cDao;
	
	@Autowired
	private ItemDao iDao;
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private OrderDao oDao;

	@Override
	public EntityInterface LoginService(LoginHelper loginHelp) {
		
	
		if(loginHelp.getRole().equals("admin")) {
			Admin admin=null;
			if(aDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0)
				admin = aDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			return admin;
		}
		else if (loginHelp.getRole().equals("HeadChef")) {

			HeadChef hc = null;

			if (hDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0) 
				hc = hDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			
			return hc;
			
		}
		else if (loginHelp.getRole().equals("Supervisor")) {
			Supervisor sv = null;

			if (sDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0) 
				sv = sDao.findByEmailAndPass(loginHelp.getEmail(),loginHelp.getPassword());
			
			return sv;

		}
		else if (loginHelp.getRole().equals("customer")) {
			Customer customer =null;
			if(cDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword())>0)
				customer = cDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			return customer;
			
		}
		
		else {
			return null;
		}
	}
	//HEAD CHEFF 
	//adding chef
	public boolean addChef(HeadChef chef) {
		HeadChef hc = hDao.save(chef);
		
		if (hc != null) {
			return true;
		} else {
			return false;
		}
	}
	//list  chefs
	public List<HeadChef> getChef() {
		List<HeadChef> chefs = hDao.findAll();
		return chefs;
	}
	
	//Deleting  chef
	public boolean deleteChef(Integer cId) {
		hDao.deleteById(cId);
		return true;
	}
	
	
	//SUPERVISOR
	
	//Adding supervisor 
	public boolean addSupervisor(Supervisor supervisor) {
		Supervisor superVisor = sDao.save(supervisor);
		if (superVisor != null) {
			return true;
		} else {
			return false;
		}
	}
	 
	//list of supervisors
	public List<Supervisor> getSupervisors() {
		List<Supervisor> supervisors = sDao.findAll();
		return supervisors;
	}
	
	//deleting supervisor
	public boolean deleteSupervisor(Integer sId) {
		sDao.deleteById(sId);
		return true;
	}
	
	//Item Add
	public boolean additem(Item item) {
		Item saveitem = iDao.save(item);
		if(saveitem != null)
			return true;
		return false;
	}
	//get Item 
	public List<Item> getItem() {
		return iDao.findAll();
	}
	
	//Delete Item
	public boolean deleteItem(Item item) {
		iDao.delete(item);
		return true;
	}
	
	//Customer service
	
	//save Customer
		public boolean addCustomer(Customer customer) {
			Customer savecustomer = cDao.save(customer);
			if(savecustomer != null)
				return true;
			return false;
		}
		//get Customer 
		public List<Customer> getCustomer() {
			return cDao.findAll();
		}
		
		//Delete Customer
		public boolean deleteCustomer(Integer cId) {
			cDao.deleteById(cId);
			return true;
		}
	
	
	public boolean addAdmin(Admin admin) {
		Admin saveAdm = aDao.save(admin);
		if(saveAdm!=null)
			return true;
		return false;
	}
	
	//Getting All Orders Which Placed By Customer
		@Override
		public List<Orders> allOrders() {
			return oDao.findAll();
		}
		
		//Orders served delivered to customer
		@Override
		public void served(int oId) {
			Optional<Orders> getOrder = oDao.findById(oId);
			getOrder.get().setOrderstatus(0);	
			oDao.save(getOrder.get());
		}
		
		@Override
		public void modify(int iId) {
			Optional<Item> getItem = iDao.findById(iId);
			getItem.get().setStatus(false);
			iDao.save(getItem.get());
		}
	
	
}
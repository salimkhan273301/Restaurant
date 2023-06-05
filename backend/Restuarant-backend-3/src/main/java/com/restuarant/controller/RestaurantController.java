package com.restuarant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restuarant.entity.Admin;
import com.restuarant.entity.Customer;
import com.restuarant.entity.HeadChef;
import com.restuarant.entity.Item;
import com.restuarant.entity.Orders;
import com.restuarant.entity.Supervisor;
import com.restuarant.login.LoginHelper;
import com.restuarant.service.RestaurantServiceInf;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RestaurantController {

	@Autowired
	RestaurantServiceInf service;
	//Admin Login 
	@RequestMapping(path="/adminLogin")
	public Admin AdminLogin(@RequestBody LoginHelper loginHelp) {
		return (Admin)service.LoginService(loginHelp);
	}
	//HeadChef Login
	@RequestMapping(path="/HeadCheflogin")
	public HeadChef ChefLogin(@RequestBody LoginHelper loginHelper) {
//		System.out.println(loginHelper);

		HeadChef chef=(HeadChef)service.LoginService(loginHelper);
		return chef;
		
	}
	//Supervisor Login
	@RequestMapping(path="/supervisorlogin")
	public Supervisor SupervisorLogin(@RequestBody LoginHelper loginHelper) {
//		System.out.println(loginHelper);

		Supervisor supervisor=(Supervisor)service.LoginService(loginHelper);
		return supervisor;
		
	}
	//Customer Login
	@PostMapping(path="/customerlogin")
	public Customer customerLogin(@RequestBody LoginHelper loginHelper) {
	System.out.println(loginHelper);

		Customer customer=(Customer)service.LoginService(loginHelper);
		return customer;
		
	}
	
	//Adding New Chef
	
	@PostMapping("/chefs")

	@CrossOrigin(origins="http://localhost:4200")
	public String addChef(@RequestBody HeadChef chef) {
		boolean flag=service.addChef(chef);
		if(flag){
			return "New Chef "+ chef.getcName()+" Added Successfully";
		}else {
			return "An error occured while saving the Chef details";
		}
	}
	//Getting chef details
	@GetMapping(path = "/chefs")
	@CrossOrigin(origins="http://localhost:4200")
	public List<HeadChef> getlistofchef(){
		List<HeadChef> chefs= new ArrayList<HeadChef>();
		chefs=service.getChef();
		return chefs;
	}
	
	//deleting chef
	@DeleteMapping(path="/chefs")
	@CrossOrigin(origins="http://localhost:4200")
	public String deleteChef(@RequestBody Integer cId) {
		boolean flag=service.deleteChef(cId);
		if(flag) {
			return "Chef details deleted successfully";
		}else {
			return "Error while deleting chef details";
		}
	}
	
	//Supervisor 
	//Adding Supervisor
	@RequestMapping(path = "/addSupervisor")
	public String addSupervisor(@RequestBody Supervisor supervisor) {
		boolean flag=service.addSupervisor(supervisor);
		if(flag){
			return "New Supervisor "+ supervisor.getsName() +" Added Successfully";
		}else {
			return "An error occured while saving the supervisor details";
		}
	}
	//getting supervisor
	@RequestMapping(path = "/getSupervisors")
	public List<Supervisor> getSuperviors(){
		return service.getSupervisors();
	}
	
	
	//Deleting Supervisor
	@RequestMapping(path = "/deleteSupervisor")
	public String deleteSupervisor(@RequestBody Integer sId) {
		boolean flag=service.deleteSupervisor(sId);
		if(flag) {
			return "Supervisor details deleted successfully";
		}else {
			return "Error while deleting Supervisor details";
		}
	}
	
	@PostMapping("/addAdmin")
	public String addAdmin(@RequestBody Admin admin) {
		boolean flag = service.addAdmin(admin);
		if(flag)
			return "New Admin "+ admin.getaName() + " added successfully";
		else
			return admin.getaName()+" couldn't be added. Error!";
	}
	
/******************* Start OF KITCHEN-CHEF REST CONTROLLER ****************/
	
	@GetMapping("/getOrders")
	
	public List<Orders> getAllOrders()
	{
		List<Orders> placedOrders = service.allOrders();
		return placedOrders;
	}
	
	@RequestMapping("/servedOrder/{oId}")
	public void servedOrder(@PathVariable int oId)
	{
		service.served(oId);
	}
	
	@GetMapping("/item")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Item> getAllItems()
	{
		List<Item> allItems = service.getItem();
		return allItems;	
	}
	
	@PostMapping("/item")
	@CrossOrigin(origins="http://localhost:4200")
	public boolean saveItem(@RequestBody Item item) {
		return service.additem(item);
		
	}
	
	@RequestMapping("/modifyItemStatus/{iId}")
	@CrossOrigin(origins="http://localhost:4200")
	public void modifyItem(@PathVariable int iId)
	{
		service.modify(iId);
	}
	
	/******************* End OF KITCHEN-CHEF REST CONTROLLER ****************/
	
	
	
	
	
	
	
	
	
	
	/******************* Start OF CUSTOMER REST CONTROLLER ****************/
	

		//Adding Customer
		@PostMapping("/user")
		@CrossOrigin("http://localhost:4200")
		public String saveCustomer(@RequestBody  Customer customer) {
			
			
			boolean flag=service.addCustomer(customer);
			if(flag){
				return "New Customer "+ customer.getcName() +" Added Successfully";
			}else {
				return "An error occured while saving the Customer details";
			}
		}
		
		
		//getting Customer
		@GetMapping(path = "/user")
		@CrossOrigin(origins="http://localhost:4200")
		public List<Customer> getCustomers(){
			return service.getCustomer();
		}
		
		
		//Deleting Supervisor
		@DeleteMapping(path = "/user/{cId}")
		@CrossOrigin(origins="http://localhost:4200")
		public String deleteCustomer(@PathVariable Integer cId) {
			boolean flag=service.deleteCustomer(cId);
			if(flag) {
				return "Customer details deleted successfully";
			}else {
				return "Error while deleting Customer details";
			}
		}
	
	
	
	
	
	/******************* End OF CUSTOMER REST CONTROLLER ****************/
}
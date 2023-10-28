package services.impl;

import services.*;
import entities.*;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.SerializationUtils;
import java.util.Iterator;

public class SearchGoodsServiceImpl implements SearchGoodsService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public SearchGoodsServiceImpl() {
		services = new ThirdPartyServicesImpl();
	}

	
	//Shared variable from system services
	
	/* Shared variable from system services and get()/set() methods */
			
	/* all get and set functions for temp property*/
				
	
	
	/* Generate inject for sharing temp variables between use cases in system service */
	public void refresh() {
		Lab1System lab1system_service = (Lab1System) ServiceManager.getAllInstancesOf("Lab1System").get(0);
	}
	
	/* Generate buiness logic according to functional requirement */
	@SuppressWarnings("unchecked")
	public boolean browseGoods(String id, String name) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get customer
		User customer = null;
		//no nested iterator --  iterator: any previous:any
		for (User cust : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (cust.getUserId().equals(id))
			{
				customer = cust;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(customer) == true) 
		{ 
			/* Logic here */
			User cust = null;
			cust = (User) EntityManager.createObject("User");
			cust.setUserId(id);
			cust.setUserName(name);
			EntityManager.addObject("User", cust);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			cust.getUserId() == id
			 && 
			cust.getUserName() == name
			 && 
			StandardOPs.includes(((List<User>)EntityManager.getAllInstancesOf("User")), cust)
			 && 
			true)) {
				throw new PostconditionException();
			}
			
		
			//return primitive type
			refresh();				
			return true;
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [id, name] 
		//all relevant vars : cust
		//all relevant entities : User
	}  
	
	static {opINVRelatedEntity.put("browseGoods", Arrays.asList("User"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}

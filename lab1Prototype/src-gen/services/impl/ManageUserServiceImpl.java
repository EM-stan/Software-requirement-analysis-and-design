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

public class ManageUserServiceImpl implements ManageUserService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public ManageUserServiceImpl() {
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
	public boolean browseUser(String userId, String userName, String userPassword, String identity) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get admin
		User admin = null;
		int id;
		//no nested iterator --  iterator: any previous:any
		for (User ad : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (ad.getUserId() == userId)
			{
				admin = ad;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(admin) == false ) 
		{ 
			/* Logic here */
			User ad = null;
			ad = (User) EntityManager.createObject("User");
			ad.setUserId(userId);
			ad.setUserName(userName);
			ad.setPassword(userPassword);
			ad.setIdentity(identity);
			EntityManager.addObject("User", ad);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			ad.getUserId() == userId
			 && 
			ad.getUserName() == userName
			 && 
			ad.getPassword() == userPassword
			 && 
			ad.getIdentity() == identity
			 && 
			StandardOPs.includes(((List<User>)EntityManager.getAllInstancesOf("User")), ad)
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
		//string parameters: [userId, userName, userPassword, identity] 
		//all relevant vars : admin
		//all relevant entities : User
	}  
	
	static {opINVRelatedEntity.put("browseUser", Arrays.asList("User"));}
	 
	@SuppressWarnings("unchecked")
	public boolean addUser(String userId, String userName, String userPassword, String identity) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get admin
		User admin = null;
		//no nested iterator --  iterator: any previous:any
		for (User ad : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (ad.getUserId() == userId)
			{
				admin = ad;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(admin) == false) 
		{ 
			/* Logic here */
			User ad = null;
			ad = (User) EntityManager.createObject("User");
			ad.setUserId(userId);
			ad.setUserName(userName);
			ad.setPassword(userPassword);
			ad.setIdentity(identity);
			EntityManager.addObject("User", admin);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			admin.getUserId() == userId
			 && 
			admin.getUserName() == userName
			 && 
			admin.getPassword() == userPassword
			 && 
			admin.getIdentity() == identity
			 && 
			StandardOPs.includes(((List<User>)EntityManager.getAllInstancesOf("User")), admin)
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
		//string parameters: [userId, userName, userPassword, identity] 
		//all relevant vars : admin
		//all relevant entities : User
	}  
	
	static {opINVRelatedEntity.put("addUser", Arrays.asList("User"));}
	 
	@SuppressWarnings("unchecked")
	public boolean deleteUser(String userId, String userName, String userPassword, String identity) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get admin
		User admin = null;
		//no nested iterator --  iterator: any previous:any
		for (User ad : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (ad.getUserId() == userId)
			{
				admin = ad;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(admin) == false) 
		{ 
			/* Logic here */
			User ad = null;
			ad = (User) EntityManager.createObject("User");
			ad.setUserId(userId);
			admin.setUserName(userName);
			admin.setPassword(userPassword);
			admin.setIdentity(identity);
			EntityManager.addObject("User", admin);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			admin.getUserId() == userId
			 && 
			admin.getUserName() == userName
			 && 
			admin.getPassword() == userPassword
			 && 
			admin.getIdentity() == identity
			 && 
			StandardOPs.includes(((List<User>)EntityManager.getAllInstancesOf("User")), admin)
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
		//string parameters: [userId, userName, userPassword, identity] 
		//all relevant vars : admin
		//all relevant entities : User
	}  
	
	static {opINVRelatedEntity.put("deleteUser", Arrays.asList("User"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}

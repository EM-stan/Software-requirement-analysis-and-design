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

public class ManageCartServiceImpl implements ManageCartService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public ManageCartServiceImpl() {
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
	public boolean addCart(String goodsId, String goodsName, String goodsNum, String goodsPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get cart
		ShoppingCart cart = null;
		//no nested iterator --  iterator: any previous:any
		for (ShoppingCart c : (List<ShoppingCart>)EntityManager.getAllInstancesOf("ShoppingCart"))
		{
			if (c.getGoodsId().equals(goodsId))
			{
				cart = c;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(cart) == true) 
		{ 
			/* Logic here */
			ShoppingCart c = null;
			c = (ShoppingCart) EntityManager.createObject("ShoppingCart");
			c.setGoodsId(goodsId);
			c.setGoodsName(goodsName);
			c.setGoodsNum(goodsNum);
			c.setGoodsPrice(goodsPrice);
			EntityManager.addObject("ShoppingCart", c);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			c.getGoodsId() == goodsId
			 && 
			c.getGoodsName() == goodsName
			 && 
			c.getGoodsNum() == goodsNum
			 && 
			c.getGoodsPrice() == goodsPrice
			 && 
			StandardOPs.includes(((List<ShoppingCart>)EntityManager.getAllInstancesOf("ShoppingCart")), c)
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
		//string parameters: [goodsId, goodsName, goodsNum, goodsPrice] 
		//all relevant vars : c
		//all relevant entities : ShoppingCart
	}  
	
	static {opINVRelatedEntity.put("addCart", Arrays.asList("ShoppingCart"));}
	 
	@SuppressWarnings("unchecked")
	public boolean browseCart(String goodsId, String goodsName, String goodsNum, String goodsPrice, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get cart
		ShoppingCart cart = null;
		//no nested iterator --  iterator: any previous:any
		for (ShoppingCart c : (List<ShoppingCart>)EntityManager.getAllInstancesOf("ShoppingCart"))
		{
			if (c.getGoodsId().equals(goodsId))
			{
				cart = c;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(cart) == true ) 
		{ 
			/* Logic here */
			ShoppingCart c = null;
			c = (ShoppingCart) EntityManager.createObject("ShoppingCart");
			c.setGoodsId(goodsId);
			c.setGoodsName(goodsName);
			c.setGoodsNum(goodsNum);
			c.setGoodsPrice(goodsPrice);
			c.setTotalPrice(totalPrice);
			EntityManager.addObject("ShoppingCart", c);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			c.getGoodsId() == goodsId
			 && 
			c.getGoodsName() == goodsName
			 && 
			c.getGoodsNum() == goodsNum
			 && 
			c.getGoodsPrice() == goodsPrice
			 && 
			c.getTotalPrice() == totalPrice
			 && 
			StandardOPs.includes(((List<ShoppingCart>)EntityManager.getAllInstancesOf("ShoppingCart")), c)
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
		//string parameters: [goodsId, goodsName, goodsNum, goodsPrice, totalPrice] 
		//all relevant vars : c
		//all relevant entities : ShoppingCart
	}  
	
	static {opINVRelatedEntity.put("browseCart", Arrays.asList("ShoppingCart"));}
	 
	@SuppressWarnings("unchecked")
	public boolean deleteCart(String goodsId, String goodsName, String goodsNum, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get cart
		ShoppingCart cart = null;
		//no nested iterator --  iterator: any previous:any
		for (ShoppingCart c : (List<ShoppingCart>)EntityManager.getAllInstancesOf("ShoppingCart"))
		{
			if (c.getGoodsId().equals(goodsId))
			{
				cart = c;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(cart) == true) 
		{ 
			/* Logic here */
			ShoppingCart c = null;
			c = (ShoppingCart) EntityManager.createObject("ShoppingCart");
			c.setGoodsId(goodsId);
			c.setGoodsName(goodsName);
			c.setGoodsNum(goodsNum);
			c.setTotalPrice(totalPrice);
			EntityManager.addObject("ShoppingCart", c);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			c.getGoodsId() == goodsId
			 && 
			c.getGoodsName() == goodsName
			 && 
			c.getGoodsNum() == goodsNum
			 && 
			c.getTotalPrice() == totalPrice
			 && 
			StandardOPs.includes(((List<ShoppingCart>)EntityManager.getAllInstancesOf("ShoppingCart")), c)
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
		//string parameters: [goodsId, goodsName, goodsNum, totalPrice] 
		//all relevant vars : c
		//all relevant entities : ShoppingCart
	}  
	
	static {opINVRelatedEntity.put("deleteCart", Arrays.asList("ShoppingCart"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}

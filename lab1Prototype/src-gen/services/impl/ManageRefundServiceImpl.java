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

public class ManageRefundServiceImpl implements ManageRefundService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public ManageRefundServiceImpl() {
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
	public boolean refuseRefund(String orderId) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get order
		Orders order = null;
		//no nested iterator --  iterator: any previous:any
		for (Orders o : (List<Orders>)EntityManager.getAllInstancesOf("Orders"))
		{
			if (o.getOrderId().equals(orderId))
			{
				order = o;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(order) == true) 
		{ 
			/* Logic here */
			Orders o = null;
			o = (Orders) EntityManager.createObject("Orders");
			o.setOrderId(orderId);
			EntityManager.addObject("Orders", o);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			o.getOrderId() == orderId
			 && 
			StandardOPs.includes(((List<Orders>)EntityManager.getAllInstancesOf("Orders")), o)
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
		//string parameters: [orderId] 
		//all relevant vars : o
		//all relevant entities : Orders
	}  
	
	static {opINVRelatedEntity.put("refuseRefund", Arrays.asList("Orders"));}
	 
	@SuppressWarnings("unchecked")
	public boolean agreeRefund(String orderId, String goodsId, String goodsName, String goodsNum, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get order
		Orders order = null;
		//no nested iterator --  iterator: any previous:any
		for (Orders o : (List<Orders>)EntityManager.getAllInstancesOf("Orders"))
		{
			if (o.getOrderId().equals(orderId))
			{
				order = o;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(order) == true) 
		{ 
			/* Logic here */
			Orders o = null;
			o = (Orders) EntityManager.createObject("Orders");
			o.setOrderId(orderId);
			o.setGoodsId(goodsId);
			o.setGoodsName(goodsName);
			o.setTotalPrice(totalPrice);
			EntityManager.addObject("Orders", o);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			o.getOrderId() == orderId
			 && 
			o.getGoodsId() == goodsId
			 && 
			o.getGoodsName() == goodsName
			 && 
			o.getTotalPrice() == totalPrice
			 && 
			StandardOPs.includes(((List<Orders>)EntityManager.getAllInstancesOf("Orders")), o)
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
		//string parameters: [orderId, goodsId, goodsName, goodsNum, totalPrice] 
		//all relevant vars : o
		//all relevant entities : Orders
	}  
	
	static {opINVRelatedEntity.put("agreeRefund", Arrays.asList("Orders"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}

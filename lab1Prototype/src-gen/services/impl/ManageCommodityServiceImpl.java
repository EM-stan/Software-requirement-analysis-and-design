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

public class ManageCommodityServiceImpl implements ManageCommodityService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public ManageCommodityServiceImpl() {
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
	public boolean addGoods(String goodsId, String goodsName, String addNum, String totalNum) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get commodity
		Commodity commodity = null;
		//no nested iterator --  iterator: any previous:any
		for (Commodity comm : (List<Commodity>)EntityManager.getAllInstancesOf("Commodity"))
		{
			if (comm.getGoodsId().equals(goodsId))
			{
				commodity = comm;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(commodity) == true) 
		{ 
			/* Logic here */
			Commodity comm = null;
			comm = (Commodity) EntityManager.createObject("Commodity");
			comm.setGoodsId(goodsId);
			comm.setGoodsNum(totalNum+addNum);
			EntityManager.addObject("Commodity", comm);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			comm.getGoodsId() == goodsId
			 && 
			comm.getGoodsNum() == totalNum+addNum
			 && 
			StandardOPs.includes(((List<Commodity>)EntityManager.getAllInstancesOf("Commodity")), comm)
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
		//string parameters: [goodsId, goodsName, addNum, totalNum] 
		//all relevant vars : comm
		//all relevant entities : Commodity
	}  
	
	static {opINVRelatedEntity.put("addGoods", Arrays.asList("Commodity"));}
	 
	@SuppressWarnings("unchecked")
	public boolean deleteGoods(String goodsId, String goodsName, String goodsNum, String totalNum) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get commodity
		Commodity commodity = null;
		//no nested iterator --  iterator: any previous:any
		for (Commodity comm : (List<Commodity>)EntityManager.getAllInstancesOf("Commodity"))
		{
			if (comm.getGoodsId().equals(goodsId))
			{
				commodity = comm;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(commodity) == true ) 
		{ 
			/* Logic here */
			Commodity comm = null;
			comm = (Commodity) EntityManager.createObject("Commodity");
			comm.setGoodsId(goodsId);
			comm.setGoodsName(goodsName);
			comm.setGoodsNum(totalNum);
			EntityManager.addObject("Commodity", comm);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			comm.getGoodsId() == goodsId
			 && 
			comm.getGoodsName() == goodsName
			 && 
			comm.getGoodsNum() == totalNum
			 && 
			StandardOPs.includes(((List<Commodity>)EntityManager.getAllInstancesOf("Commodity")), comm)
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
		//string parameters: [goodsId, goodsName, goodsNum, totalNum] 
		//all relevant vars : comm
		//all relevant entities : Commodity
	}  
	
	static {opINVRelatedEntity.put("deleteGoods", Arrays.asList("Commodity"));}
	 
	@SuppressWarnings("unchecked")
	public boolean checkGoods(String goodsId, String goodsName, String goodsNum, String goodsPrice, String totalNum) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get commodity
		Commodity commodity = null;
		//no nested iterator --  iterator: any previous:any
		for (Commodity comm : (List<Commodity>)EntityManager.getAllInstancesOf("Commodity"))
		{
			if (comm.getGoodsId().equals(goodsId))
			{
				commodity = comm;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(commodity) == true) 
		{ 
			/* Logic here */
			Commodity comm = null;
			comm = (Commodity) EntityManager.createObject("Commodity");
			comm.setGoodsId(goodsId);
			comm.setGoodsName(goodsName);
			comm.setGoodsPrice(goodsPrice);
			comm.setGoodsNum(totalNum);
			EntityManager.addObject("Commodity", comm);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			comm.getGoodsId() == goodsId
			 && 
			comm.getGoodsName() == goodsName
			 && 
			comm.getGoodsPrice() == goodsPrice
			 && 
			comm.getGoodsNum() == totalNum
			 && 
			StandardOPs.includes(((List<Commodity>)EntityManager.getAllInstancesOf("Commodity")), comm)
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
		//string parameters: [goodsId, goodsName, goodsNum, goodsPrice, totalNum] 
		//all relevant vars : comm
		//all relevant entities : Commodity
	}  
	
	static {opINVRelatedEntity.put("checkGoods", Arrays.asList("Commodity"));}
	 
	@SuppressWarnings("unchecked")
	public boolean modifyPrice(String goodsId, String goodsName, String goodsPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get commodity
		Commodity commodity = null;
		//no nested iterator --  iterator: any previous:any
		for (Commodity comm : (List<Commodity>)EntityManager.getAllInstancesOf("Commodity"))
		{
			if (comm.getGoodsId().equals(goodsId))
			{
				commodity = comm;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(commodity) == true ) 
		{ 
			/* Logic here */
			Commodity comm = null;
			comm = (Commodity) EntityManager.createObject("Commodity");
			comm.setGoodsId(goodsId);
			comm.setGoodsName(goodsName);
			comm.setGoodsPrice(goodsPrice);
			EntityManager.addObject("Commodity", comm);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			comm.getGoodsId() == goodsId
			 && 
			comm.getGoodsName() == goodsName
			 && 
			comm.getGoodsPrice() == goodsPrice
			 && 
			StandardOPs.includes(((List<Commodity>)EntityManager.getAllInstancesOf("Commodity")), comm)
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
		//string parameters: [goodsId, goodsName, goodsPrice] 
		//all relevant vars : comm
		//all relevant entities : Commodity
	}  
	
	static {opINVRelatedEntity.put("modifyPrice", Arrays.asList("Commodity"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}

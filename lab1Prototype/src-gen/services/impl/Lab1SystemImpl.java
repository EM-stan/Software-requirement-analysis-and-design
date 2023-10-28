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

public class Lab1SystemImpl implements Lab1System, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public Lab1SystemImpl() {
		services = new ThirdPartyServicesImpl();
	}

	public void refresh() {
		SearchGoodsService searchgoodsservice_service = (SearchGoodsService) ServiceManager
				.getAllInstancesOf("SearchGoodsService").get(0);
		ManageCartService managecartservice_service = (ManageCartService) ServiceManager
				.getAllInstancesOf("ManageCartService").get(0);
		OrderPaymentService orderpaymentservice_service = (OrderPaymentService) ServiceManager
				.getAllInstancesOf("OrderPaymentService").get(0);
		ApplyRefundService applyrefundservice_service = (ApplyRefundService) ServiceManager
				.getAllInstancesOf("ApplyRefundService").get(0);
		MabageOrdersService mabageordersservice_service = (MabageOrdersService) ServiceManager
				.getAllInstancesOf("MabageOrdersService").get(0);
		ManageRefundService managerefundservice_service = (ManageRefundService) ServiceManager
				.getAllInstancesOf("ManageRefundService").get(0);
		ManageCommodityService managecommodityservice_service = (ManageCommodityService) ServiceManager
				.getAllInstancesOf("ManageCommodityService").get(0);
		ManageUserService manageuserservice_service = (ManageUserService) ServiceManager
				.getAllInstancesOf("ManageUserService").get(0);
	}			
	
	/* Generate buiness logic according to functional requirement */
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}

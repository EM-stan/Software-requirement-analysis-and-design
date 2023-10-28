package services.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import services.*;
	
public class ServiceManager {
	
	private static Map<String, List> AllServiceInstance = new HashMap<String, List>();
	
	private static List<Lab1System> Lab1SystemInstances = new LinkedList<Lab1System>();
	private static List<ThirdPartyServices> ThirdPartyServicesInstances = new LinkedList<ThirdPartyServices>();
	private static List<SearchGoodsService> SearchGoodsServiceInstances = new LinkedList<SearchGoodsService>();
	private static List<ManageCartService> ManageCartServiceInstances = new LinkedList<ManageCartService>();
	private static List<OrderPaymentService> OrderPaymentServiceInstances = new LinkedList<OrderPaymentService>();
	private static List<ApplyRefundService> ApplyRefundServiceInstances = new LinkedList<ApplyRefundService>();
	private static List<MabageOrdersService> MabageOrdersServiceInstances = new LinkedList<MabageOrdersService>();
	private static List<ManageRefundService> ManageRefundServiceInstances = new LinkedList<ManageRefundService>();
	private static List<ManageCommodityService> ManageCommodityServiceInstances = new LinkedList<ManageCommodityService>();
	private static List<ManageUserService> ManageUserServiceInstances = new LinkedList<ManageUserService>();
	
	static {
		AllServiceInstance.put("Lab1System", Lab1SystemInstances);
		AllServiceInstance.put("ThirdPartyServices", ThirdPartyServicesInstances);
		AllServiceInstance.put("SearchGoodsService", SearchGoodsServiceInstances);
		AllServiceInstance.put("ManageCartService", ManageCartServiceInstances);
		AllServiceInstance.put("OrderPaymentService", OrderPaymentServiceInstances);
		AllServiceInstance.put("ApplyRefundService", ApplyRefundServiceInstances);
		AllServiceInstance.put("MabageOrdersService", MabageOrdersServiceInstances);
		AllServiceInstance.put("ManageRefundService", ManageRefundServiceInstances);
		AllServiceInstance.put("ManageCommodityService", ManageCommodityServiceInstances);
		AllServiceInstance.put("ManageUserService", ManageUserServiceInstances);
	} 
	
	public static List getAllInstancesOf(String ClassName) {
			 return AllServiceInstance.get(ClassName);
	}	
	
	public static Lab1System createLab1System() {
		Lab1System s = new Lab1SystemImpl();
		Lab1SystemInstances.add(s);
		return s;
	}
	public static ThirdPartyServices createThirdPartyServices() {
		ThirdPartyServices s = new ThirdPartyServicesImpl();
		ThirdPartyServicesInstances.add(s);
		return s;
	}
	public static SearchGoodsService createSearchGoodsService() {
		SearchGoodsService s = new SearchGoodsServiceImpl();
		SearchGoodsServiceInstances.add(s);
		return s;
	}
	public static ManageCartService createManageCartService() {
		ManageCartService s = new ManageCartServiceImpl();
		ManageCartServiceInstances.add(s);
		return s;
	}
	public static OrderPaymentService createOrderPaymentService() {
		OrderPaymentService s = new OrderPaymentServiceImpl();
		OrderPaymentServiceInstances.add(s);
		return s;
	}
	public static ApplyRefundService createApplyRefundService() {
		ApplyRefundService s = new ApplyRefundServiceImpl();
		ApplyRefundServiceInstances.add(s);
		return s;
	}
	public static MabageOrdersService createMabageOrdersService() {
		MabageOrdersService s = new MabageOrdersServiceImpl();
		MabageOrdersServiceInstances.add(s);
		return s;
	}
	public static ManageRefundService createManageRefundService() {
		ManageRefundService s = new ManageRefundServiceImpl();
		ManageRefundServiceInstances.add(s);
		return s;
	}
	public static ManageCommodityService createManageCommodityService() {
		ManageCommodityService s = new ManageCommodityServiceImpl();
		ManageCommodityServiceInstances.add(s);
		return s;
	}
	public static ManageUserService createManageUserService() {
		ManageUserService s = new ManageUserServiceImpl();
		ManageUserServiceInstances.add(s);
		return s;
	}
}	

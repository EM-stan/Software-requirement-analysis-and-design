package entities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.Method;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.File;

public class EntityManager {

	private static Map<String, List> AllInstance = new HashMap<String, List>();
	
	private static List<User> UserInstances = new LinkedList<User>();
	private static List<Customer> CustomerInstances = new LinkedList<Customer>();
	private static List<Admin> AdminInstances = new LinkedList<Admin>();
	private static List<SuperAdmin> SuperAdminInstances = new LinkedList<SuperAdmin>();
	private static List<Orders> OrdersInstances = new LinkedList<Orders>();
	private static List<ShoppingCart> ShoppingCartInstances = new LinkedList<ShoppingCart>();
	private static List<Commodity> CommodityInstances = new LinkedList<Commodity>();
	private static List<Goods> GoodsInstances = new LinkedList<Goods>();
	private static List<Payment> PaymentInstances = new LinkedList<Payment>();

	
	/* Put instances list into Map */
	static {
		AllInstance.put("User", UserInstances);
		AllInstance.put("Customer", CustomerInstances);
		AllInstance.put("Admin", AdminInstances);
		AllInstance.put("SuperAdmin", SuperAdminInstances);
		AllInstance.put("Orders", OrdersInstances);
		AllInstance.put("ShoppingCart", ShoppingCartInstances);
		AllInstance.put("Commodity", CommodityInstances);
		AllInstance.put("Goods", GoodsInstances);
		AllInstance.put("Payment", PaymentInstances);
	} 
		
	/* Save State */
	public static void save(File file) {
		
		try {
			
			ObjectOutputStream stateSave = new ObjectOutputStream(new FileOutputStream(file));
			
			stateSave.writeObject(UserInstances);
			stateSave.writeObject(CustomerInstances);
			stateSave.writeObject(AdminInstances);
			stateSave.writeObject(SuperAdminInstances);
			stateSave.writeObject(OrdersInstances);
			stateSave.writeObject(ShoppingCartInstances);
			stateSave.writeObject(CommodityInstances);
			stateSave.writeObject(GoodsInstances);
			stateSave.writeObject(PaymentInstances);
			
			stateSave.close();
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* Load State */
	public static void load(File file) {
		
		try {
			
			ObjectInputStream stateLoad = new ObjectInputStream(new FileInputStream(file));
			
			try {
				
				UserInstances =  (List<User>) stateLoad.readObject();
				AllInstance.put("User", UserInstances);
				CustomerInstances =  (List<Customer>) stateLoad.readObject();
				AllInstance.put("Customer", CustomerInstances);
				AdminInstances =  (List<Admin>) stateLoad.readObject();
				AllInstance.put("Admin", AdminInstances);
				SuperAdminInstances =  (List<SuperAdmin>) stateLoad.readObject();
				AllInstance.put("SuperAdmin", SuperAdminInstances);
				OrdersInstances =  (List<Orders>) stateLoad.readObject();
				AllInstance.put("Orders", OrdersInstances);
				ShoppingCartInstances =  (List<ShoppingCart>) stateLoad.readObject();
				AllInstance.put("ShoppingCart", ShoppingCartInstances);
				CommodityInstances =  (List<Commodity>) stateLoad.readObject();
				AllInstance.put("Commodity", CommodityInstances);
				GoodsInstances =  (List<Goods>) stateLoad.readObject();
				AllInstance.put("Goods", GoodsInstances);
				PaymentInstances =  (List<Payment>) stateLoad.readObject();
				AllInstance.put("Payment", PaymentInstances);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	/* create object */  
	public static Object createObject(String Classifer) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method createObjectMethod = c.getDeclaredMethod("create" + Classifer + "Object");
			return createObjectMethod.invoke(c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/* add object */  
	public static Object addObject(String Classifer, Object ob) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method addObjectMethod = c.getDeclaredMethod("add" + Classifer + "Object", Class.forName("entities." + Classifer));
			return  (boolean) addObjectMethod.invoke(c, ob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}	
	
	/* add objects */  
	public static Object addObjects(String Classifer, List obs) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method addObjectsMethod = c.getDeclaredMethod("add" + Classifer + "Objects", Class.forName("java.util.List"));
			return  (boolean) addObjectsMethod.invoke(c, obs);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/* Release object */
	public static boolean deleteObject(String Classifer, Object ob) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method deleteObjectMethod = c.getDeclaredMethod("delete" + Classifer + "Object", Class.forName("entities." + Classifer));
			return  (boolean) deleteObjectMethod.invoke(c, ob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/* Release objects */
	public static boolean deleteObjects(String Classifer, List obs) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method deleteObjectMethod = c.getDeclaredMethod("delete" + Classifer + "Objects", Class.forName("java.util.List"));
			return  (boolean) deleteObjectMethod.invoke(c, obs);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}		 	
	
	 /* Get all objects belongs to same class */
	public static List getAllInstancesOf(String ClassName) {
			 return AllInstance.get(ClassName);
	}	

   /* Sub-create object */
	public static User createUserObject() {
		User o = new User();
		return o;
	}
	
	public static boolean addUserObject(User o) {
		return UserInstances.add(o);
	}
	
	public static boolean addUserObjects(List<User> os) {
		return UserInstances.addAll(os);
	}
	
	public static boolean deleteUserObject(User o) {
		return UserInstances.remove(o);
	}
	
	public static boolean deleteUserObjects(List<User> os) {
		return UserInstances.removeAll(os);
	}
	public static Customer createCustomerObject() {
		Customer o = new Customer();
		return o;
	}
	
	public static boolean addCustomerObject(Customer o) {
		return CustomerInstances.add(o);
	}
	
	public static boolean addCustomerObjects(List<Customer> os) {
		return CustomerInstances.addAll(os);
	}
	
	public static boolean deleteCustomerObject(Customer o) {
		return CustomerInstances.remove(o);
	}
	
	public static boolean deleteCustomerObjects(List<Customer> os) {
		return CustomerInstances.removeAll(os);
	}
	public static Admin createAdminObject() {
		Admin o = new Admin();
		return o;
	}
	
	public static boolean addAdminObject(Admin o) {
		return AdminInstances.add(o);
	}
	
	public static boolean addAdminObjects(List<Admin> os) {
		return AdminInstances.addAll(os);
	}
	
	public static boolean deleteAdminObject(Admin o) {
		return AdminInstances.remove(o);
	}
	
	public static boolean deleteAdminObjects(List<Admin> os) {
		return AdminInstances.removeAll(os);
	}
	public static SuperAdmin createSuperAdminObject() {
		SuperAdmin o = new SuperAdmin();
		return o;
	}
	
	public static boolean addSuperAdminObject(SuperAdmin o) {
		return SuperAdminInstances.add(o);
	}
	
	public static boolean addSuperAdminObjects(List<SuperAdmin> os) {
		return SuperAdminInstances.addAll(os);
	}
	
	public static boolean deleteSuperAdminObject(SuperAdmin o) {
		return SuperAdminInstances.remove(o);
	}
	
	public static boolean deleteSuperAdminObjects(List<SuperAdmin> os) {
		return SuperAdminInstances.removeAll(os);
	}
	public static Orders createOrdersObject() {
		Orders o = new Orders();
		return o;
	}
	
	public static boolean addOrdersObject(Orders o) {
		return OrdersInstances.add(o);
	}
	
	public static boolean addOrdersObjects(List<Orders> os) {
		return OrdersInstances.addAll(os);
	}
	
	public static boolean deleteOrdersObject(Orders o) {
		return OrdersInstances.remove(o);
	}
	
	public static boolean deleteOrdersObjects(List<Orders> os) {
		return OrdersInstances.removeAll(os);
	}
	public static ShoppingCart createShoppingCartObject() {
		ShoppingCart o = new ShoppingCart();
		return o;
	}
	
	public static boolean addShoppingCartObject(ShoppingCart o) {
		return ShoppingCartInstances.add(o);
	}
	
	public static boolean addShoppingCartObjects(List<ShoppingCart> os) {
		return ShoppingCartInstances.addAll(os);
	}
	
	public static boolean deleteShoppingCartObject(ShoppingCart o) {
		return ShoppingCartInstances.remove(o);
	}
	
	public static boolean deleteShoppingCartObjects(List<ShoppingCart> os) {
		return ShoppingCartInstances.removeAll(os);
	}
	public static Commodity createCommodityObject() {
		Commodity o = new Commodity();
		return o;
	}
	
	public static boolean addCommodityObject(Commodity o) {
		return CommodityInstances.add(o);
	}
	
	public static boolean addCommodityObjects(List<Commodity> os) {
		return CommodityInstances.addAll(os);
	}
	
	public static boolean deleteCommodityObject(Commodity o) {
		return CommodityInstances.remove(o);
	}
	
	public static boolean deleteCommodityObjects(List<Commodity> os) {
		return CommodityInstances.removeAll(os);
	}
	public static Goods createGoodsObject() {
		Goods o = new Goods();
		return o;
	}
	
	public static boolean addGoodsObject(Goods o) {
		return GoodsInstances.add(o);
	}
	
	public static boolean addGoodsObjects(List<Goods> os) {
		return GoodsInstances.addAll(os);
	}
	
	public static boolean deleteGoodsObject(Goods o) {
		return GoodsInstances.remove(o);
	}
	
	public static boolean deleteGoodsObjects(List<Goods> os) {
		return GoodsInstances.removeAll(os);
	}
	public static Payment createPaymentObject() {
		Payment o = new Payment();
		return o;
	}
	
	public static boolean addPaymentObject(Payment o) {
		return PaymentInstances.add(o);
	}
	
	public static boolean addPaymentObjects(List<Payment> os) {
		return PaymentInstances.addAll(os);
	}
	
	public static boolean deletePaymentObject(Payment o) {
		return PaymentInstances.remove(o);
	}
	
	public static boolean deletePaymentObjects(List<Payment> os) {
		return PaymentInstances.removeAll(os);
	}
  
}


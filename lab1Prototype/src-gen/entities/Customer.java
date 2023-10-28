package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Customer extends User  implements Serializable {
	
	/* all primary attributes */
	private int OrderNum;
	
	/* all references */
	private List<Orders> CustomerHasOrders = new LinkedList<Orders>(); 
	
	/* all get and set functions */
	public int getOrderNum() {
		return OrderNum;
	}	
	
	public void setOrderNum(int ordernum) {
		this.OrderNum = ordernum;
	}
	
	/* all functions for reference*/
	public List<Orders> getCustomerHasOrders() {
		return CustomerHasOrders;
	}	
	
	public void addCustomerHasOrders(Orders orders) {
		this.CustomerHasOrders.add(orders);
	}
	
	public void deleteCustomerHasOrders(Orders orders) {
		this.CustomerHasOrders.remove(orders);
	}
	


}

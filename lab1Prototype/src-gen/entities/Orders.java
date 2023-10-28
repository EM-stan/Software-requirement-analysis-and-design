package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Orders implements Serializable {
	
	/* all primary attributes */
	private String OrderId;
	private String GoodsId;
	private String GoodsName;
	private String GoodsPrice;
	private String TotalPrice;
	private String UserId;
	private OrderAffairType OrderAffair;
	
	/* all references */
	private User OrderstoUser; 
	private Customer OrdersOfCustomer; 
	private ShoppingCart OrdersFromShoppingCart; 
	private List<Goods> OrdersHasGoods = new LinkedList<Goods>(); 
	
	/* all get and set functions */
	public String getOrderId() {
		return OrderId;
	}	
	
	public void setOrderId(String orderid) {
		this.OrderId = orderid;
	}
	public String getGoodsId() {
		return GoodsId;
	}	
	
	public void setGoodsId(String goodsid) {
		this.GoodsId = goodsid;
	}
	public String getGoodsName() {
		return GoodsName;
	}	
	
	public void setGoodsName(String goodsname) {
		this.GoodsName = goodsname;
	}
	public String getGoodsPrice() {
		return GoodsPrice;
	}	
	
	public void setGoodsPrice(String goodsprice) {
		this.GoodsPrice = goodsprice;
	}
	public String getTotalPrice() {
		return TotalPrice;
	}	
	
	public void setTotalPrice(String totalprice) {
		this.TotalPrice = totalprice;
	}
	public String getUserId() {
		return UserId;
	}	
	
	public void setUserId(String userid) {
		this.UserId = userid;
	}
	public OrderAffairType getOrderAffair() {
		return OrderAffair;
	}	
	
	public void setOrderAffair(OrderAffairType orderaffair) {
		this.OrderAffair = orderaffair;
	}
	
	/* all functions for reference*/
	public User getOrderstoUser() {
		return OrderstoUser;
	}	
	
	public void setOrderstoUser(User user) {
		this.OrderstoUser = user;
	}			
	public Customer getOrdersOfCustomer() {
		return OrdersOfCustomer;
	}	
	
	public void setOrdersOfCustomer(Customer customer) {
		this.OrdersOfCustomer = customer;
	}			
	public ShoppingCart getOrdersFromShoppingCart() {
		return OrdersFromShoppingCart;
	}	
	
	public void setOrdersFromShoppingCart(ShoppingCart shoppingcart) {
		this.OrdersFromShoppingCart = shoppingcart;
	}			
	public List<Goods> getOrdersHasGoods() {
		return OrdersHasGoods;
	}	
	
	public void addOrdersHasGoods(Goods goods) {
		this.OrdersHasGoods.add(goods);
	}
	
	public void deleteOrdersHasGoods(Goods goods) {
		this.OrdersHasGoods.remove(goods);
	}

	
	


}

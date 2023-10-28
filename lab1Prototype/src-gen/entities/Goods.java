package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Goods implements Serializable {
	
	/* all primary attributes */
	private String GoodsId;
	private String GoodsName;
	private String GoodsNum;
	private String GoodsPrice;
	
	/* all references */
	private List<ShoppingCart> GoodsInShoppingCart = new LinkedList<ShoppingCart>(); 
	private List<Orders> GoodsInOrders = new LinkedList<Orders>(); 
	
	/* all get and set functions */
	public String getGoodsId() {
		return GoodsId;
	}	
	
	public void setGoodsId(String goodsId2) {
		this.GoodsId = goodsId2;
	}
	public String getGoodsName() {
		return GoodsName;
	}	
	
	public void setGoodsName(String goodsname) {
		this.GoodsName = goodsname;
	}
	public String getGoodsNum() {
		return GoodsNum;
	}	
	
	public void setGoodsNum(String goodsnum) {
		this.GoodsNum = goodsnum;
	}
	public String getGoodsPrice() {
		return GoodsPrice;
	}	
	
	public void setGoodsPrice(String goodsprice) {
		this.GoodsPrice = goodsprice;
	}
	
	/* all functions for reference*/
	public List<ShoppingCart> getGoodsInShoppingCart() {
		return GoodsInShoppingCart;
	}	
	
	public void addGoodsInShoppingCart(ShoppingCart shoppingcart) {
		this.GoodsInShoppingCart.add(shoppingcart);
	}
	
	public void deleteGoodsInShoppingCart(ShoppingCart shoppingcart) {
		this.GoodsInShoppingCart.remove(shoppingcart);
	}
	public List<Orders> getGoodsInOrders() {
		return GoodsInOrders;
	}	
	
	public void addGoodsInOrders(Orders orders) {
		this.GoodsInOrders.add(orders);
	}
	
	public void deleteGoodsInOrders(Orders orders) {
		this.GoodsInOrders.remove(orders);
	}
	


}

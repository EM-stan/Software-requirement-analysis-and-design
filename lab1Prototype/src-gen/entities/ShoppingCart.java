package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class ShoppingCart implements Serializable {
	
	/* all primary attributes */
	private String GoodsId;
	private String GoodsName;
	private String GoodsNum;
	private String GoodsPrice;
	private CartAffiarType CartAffair;
	private int UserId;
	private String TotalPrice;
	
	/* all references */
	private Orders ShoppingCartToOrders; 
	private List<Goods> ShoppingCartHasGoods = new LinkedList<Goods>(); 
	
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
	public CartAffiarType getCartAffair() {
		return CartAffair;
	}	
	
	public void setCartAffair(CartAffiarType cartaffair) {
		this.CartAffair = cartaffair;
	}
	public int getUserId() {
		return UserId;
	}	
	
	public void setUserId(int userid) {
		this.UserId = userid;
	}
	public String getTotalPrice() {
		return TotalPrice;
	}	
	
	public void setTotalPrice(String totalprice) {
		this.TotalPrice = totalprice;
	}
	
	/* all functions for reference*/
	public Orders getShoppingCartToOrders() {
		return ShoppingCartToOrders;
	}	
	
	public void setShoppingCartToOrders(Orders orders) {
		this.ShoppingCartToOrders = orders;
	}			
	public List<Goods> getShoppingCartHasGoods() {
		return ShoppingCartHasGoods;
	}	
	
	public void addShoppingCartHasGoods(Goods goods) {
		this.ShoppingCartHasGoods.add(goods);
	}
	
	public void deleteShoppingCartHasGoods(Goods goods) {
		this.ShoppingCartHasGoods.remove(goods);
	}
	


}

package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Commodity extends Goods  implements Serializable {
	
	/* all primary attributes */
	private int ModifyPrice;
	private ComAffairType ComAffair;
	
	/* all references */
	
	/* all get and set functions */
	public int getModifyPrice() {
		return ModifyPrice;
	}	
	
	public void setModifyPrice(int modifyprice) {
		this.ModifyPrice = modifyprice;
	}
	public ComAffairType getComAffair() {
		return ComAffair;
	}	
	
	public void setComAffair(ComAffairType comaffair) {
		this.ComAffair = comaffair;
	}
	
	/* all functions for reference*/
	


}

package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Admin extends User  implements Serializable {
	
	/* all primary attributes */
	private int PlaceOrderNum;
	
	/* all references */
	
	/* all get and set functions */
	public int getPlaceOrderNum() {
		return PlaceOrderNum;
	}	
	
	public void setPlaceOrderNum(int placeordernum) {
		this.PlaceOrderNum = placeordernum;
	}
	
	/* all functions for reference*/
	


}

package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class SuperAdmin extends User  implements Serializable {
	
	/* all primary attributes */
	private String Introduce;
	
	/* all references */
	
	/* all get and set functions */
	public String getIntroduce() {
		return Introduce;
	}	
	
	public void setIntroduce(String introduce) {
		this.Introduce = introduce;
	}
	
	/* all functions for reference*/
	


}

package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Payment extends Orders  implements Serializable {
	
	/* all primary attributes */
	private boolean IfPay;
	private boolean IfRefund;
	
	/* all references */
	
	/* all get and set functions */
	public boolean getIfPay() {
		return IfPay;
	}	
	
	public void setIfPay(boolean ifpay) {
		this.IfPay = ifpay;
	}
	public boolean getIfRefund() {
		return IfRefund;
	}	
	
	public void setIfRefund(boolean ifrefund) {
		this.IfRefund = ifrefund;
	}
	
	/* all functions for reference*/
	


}

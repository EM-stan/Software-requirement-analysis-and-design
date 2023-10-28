package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface ManageRefundService {

	/* all system operations of the use case*/
	boolean refuseRefund(String orderId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean agreeRefund(String orderId, String goodsId, String goodsName, String goodsNum, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}

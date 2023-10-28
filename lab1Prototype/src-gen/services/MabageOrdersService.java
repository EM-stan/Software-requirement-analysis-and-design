package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface MabageOrdersService {

	/* all system operations of the use case*/
	boolean browseOrder(String orderId, String goodsId, String goodsName, String goodsPrice, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean deleteOrder(String orderId, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}

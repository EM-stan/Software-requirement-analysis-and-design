package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface ManageCartService {

	/* all system operations of the use case*/
	boolean addCart(String goodsId, String goodsName, String goodsNum, String goodsPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean browseCart(String goodsId, String goodsName, String goodsNum, String goodsPrice, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean deleteCart(String goodsId, String goodsName, String goodsNum, String totalPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}

package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface ManageCommodityService {

	/* all system operations of the use case*/
	boolean addGoods(String goodsId, String goodsName, String addNum, String totalNum) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean deleteGoods(String goodsId, String goodsName, String goodsNum, String totalNum) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean checkGoods(String goodsId, String goodsName, String goodsNum, String goodsPrice, String totalNum) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean modifyPrice(String goodsId, String goodsName, String goodsPrice) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}

package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface ManageUserService {

	/* all system operations of the use case*/
	boolean browseUser(String userId, String userName, String userPassword, String identity) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean addUser(String userId, String userName, String userPassword, String identity) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean deleteUser(String userId, String userName, String userPassword, String identity) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}

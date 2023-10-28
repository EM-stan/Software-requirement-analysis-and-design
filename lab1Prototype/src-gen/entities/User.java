package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class User implements Serializable {
	
	/* all primary attributes */
	private String UserId;
	private String UserName;
	private String Password;
	private UserStatus UserStatus;
	private String Identity;
	
	/* all references */
	
	/* all get and set functions */
	public String getUserId() {
		return UserId;
	}	
	
	public void setUserId(String userId2) {
		this.UserId = userId2;
	}
	public String getUserName() {
		return UserName;
	}	
	
	public void setUserName(String username) {
		this.UserName = username;
	}
	public String getPassword() {
		return Password;
	}	
	
	public void setPassword(String password) {
		this.Password = password;
	}
	public UserStatus getUserStatus() {
		return UserStatus;
	}	
	
	public void setUserStatus(UserStatus userstatus) {
		this.UserStatus = userstatus;
	}
	public String getIdentity() {
		return Identity;
	}	
	
	public void setIdentity(String identity) {
		this.Identity = identity;
	}
	
	/* all functions for reference*/
	


}

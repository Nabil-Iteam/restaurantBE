package restaurant.restaurantBE.models;

import java.util.Set;


public class SignupRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<String> roleNames;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the roleNames
	 */
	public Set<String> getRoleNames() {
		return roleNames;
	}
	/**
	 * @param roleNames the roleNames to set
	 */
	public void setRoleNames(Set<String> roleNames) {
		this.roleNames = roleNames;
	}


    
}

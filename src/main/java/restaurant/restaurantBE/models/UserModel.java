package restaurant.restaurantBE.models;

import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		private String firstName;
		private String lastName;
		private String email;
		private String password;
		private Long phone;
		private String address;
		private String experience;
		private String speciality;
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
		private Set<RoleModel> roles;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getExperience() {
			return experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}

		public String getSpeciality() {
			return speciality;
		}

		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}

		public Set<RoleModel> getRoles() {
			return roles;
		}

		public void setRoles(Set<RoleModel> roles) {
			this.roles = roles;
		}

		public UserModel(Long phone, String firstName, String lastName, String email, String password, String address,
				String experience, String speciality, Set<RoleModel> roles) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.phone = phone;
			this.address = address;
			this.experience = experience;
			this.speciality = speciality;
			this.roles = roles;
		}

		public UserModel() {
			super();
			// TODO Auto-generated constructor stub
		}

		

}

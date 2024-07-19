package restaurant.restaurantBE.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
	public class RoleModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String name ;
	
	
	@ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("roles")
    private Set<UserModel> users;

	public RoleModel(Long id, String name, Set<UserModel> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public Set<UserModel> getUsers() {
		return users;
	}

	public void setUsers(Set<UserModel> users) {
		this.users = users;
	}

	public RoleModel() {
		
	}
	
	
	
}

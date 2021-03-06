package pt.rupeal.invoicexpress.model;

import java.util.List;

import pt.rupeal.invoicexpress.enums.RoleEnum;

public class AccountModel {

	public static final String ID = "id";
	
	private String id;
	private String name;
	private String url;
	private String apiKey;
	private String state;
	private List<RoleEnum> roles;
	private boolean blocked;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getApiKey() {
		return apiKey;
	}
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public List<RoleEnum> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEnum> roles) {
		this.roles = roles;
	}	
	
	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
}

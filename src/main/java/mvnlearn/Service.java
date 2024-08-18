package mvnlearn;

public class Service {

	private int userId;
	
	private String username;
	
	private String password;
	
	private Repository repository;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public Service() {
		super();
	}

	@Override
	public String toString() {
		return "Service [userId=" + userId + ", username=" + username + ", password=" + password + ", repository="
				+ repository + "]";
	}

	
	
}

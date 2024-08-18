package mvnlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("gir")
public class GirishCreds {
	
	@Value("girish")
	private String username;
	
	@Value("pass123")
	private String password;

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

	@Override
	public String toString() {
		return "GirishCreds [username=" + username + ", password=" + password + "]";
	}

	public GirishCreds() {
		super();
	}
	
	

}

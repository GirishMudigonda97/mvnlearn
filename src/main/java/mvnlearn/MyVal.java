package mvnlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyVal {
	@Value("${my.name}")
	private String name;
	
	@Value("${my.password}")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MyVal() {
		super();
	}

	@Override
	public String toString() {
		return "MyVal [name=" + name + ", password=" + password + "]";
	}
	
	

}

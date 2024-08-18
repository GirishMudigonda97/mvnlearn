package mvnlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("log")
public class Login {
	
	@Autowired
	private MyVal myval;

	@Override
	public String toString() {
		return "Login [myval=" + myval + "]";
	}

	public Login() {
		super();
	}

	public MyVal getMyval() {
		return myval;
	}

	public void setMyval(MyVal myval) {
		this.myval = myval;
	}

}

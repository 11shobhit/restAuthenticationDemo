package restauthentication;

import org.glassfish.jersey.server.ResourceConfig;

public class AuthRegister extends ResourceConfig{
	AuthRegister(){
		packages("restauthentication");
		register(RequestFilter.class);
		register(ResponseFilter.class);
	}

}

package restauthentication;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

//compulsory annotation, annotates the component as a provider of something. It is used to extend the base JAX-RS functionality
@Provider
public class RequestFilter implements ContainerRequestFilter {

	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("==========in the rset filetr");

	}

}

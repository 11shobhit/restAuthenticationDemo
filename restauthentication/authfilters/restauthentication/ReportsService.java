package restauthentication;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/report")
public class ReportsService {
	
	@GET
	@Path("/getReports")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getReports() {
		System.out.println("===============");
		return Response.ok().build();
	}


}

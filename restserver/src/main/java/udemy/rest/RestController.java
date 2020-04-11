package udemy.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import udemy.json.domain.UdemyStudent;

@Path("/")
public class RestController {

	//rest/jsonUdemyStudent
	
	@GET
	@Produces("application/json")
	@Path("/jsonUdemyStudent")
	public Response getUdemyStudentJson() {
		UdemyStudent udemyStudent =  new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setName("name");
		udemyStudent.setLastname("lastname");
		
		return Response.ok(udemyStudent).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/jsonUdemyStudentList")
	public Response getUdemyStudentJsonList() {
		
		UdemyStudent udemyStudent =  new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setName("name");
		udemyStudent.setLastname("lastname");
		
		UdemyStudent udemyStudent2 =  new UdemyStudent();
		udemyStudent2.setId(2);
		udemyStudent2.setName("name2");
		udemyStudent2.setLastname("lastname2");
		
		List<UdemyStudent> udemyStudentList = Arrays.asList(udemyStudent,udemyStudent2);
		
		return Response.ok(udemyStudentList).build();
	}
	
	@POST
	@Consumes("application/json")
	@Path("/jsonPost")
	public Response post(String json) {
		System.out.println("post: " + json);
		return Response.ok().build();
	}
	
	@POST
	@Consumes("application/json")
	@Path("jsonPostStudent")
	public Response post(UdemyStudent udemyStudent) {
		System.out.println("post udemyStudent id: " + udemyStudent.getId() + " name: " 
	+ udemyStudent.getName() + " lastname: " + udemyStudent.getLastname());
		
		return Response.ok().build();
		
	}
	
}

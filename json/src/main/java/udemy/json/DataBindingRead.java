package udemy.json;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class DataBindingRead {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		
		String udemyStudentJSON = "{" +
		    "\"id\" : 1," +
		    "\"name\" : \"tuna\"," +
		    "\"lastname\" : \"tore\"" +
		"}";
		
		try {
			UdemyStudent udemyStudent = objectMapper.readValue(udemyStudentJSON, UdemyStudent.class);
			System.out.println("id:" + udemyStudent.getId());
			System.out.println("name:" + udemyStudent.getName());
			System.out.println("lastname:" + udemyStudent.getLastname());
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ClassLoader classLoader = DataBindingRead.class.getClassLoader();
		
		try {
			Map<String, Object> mapJSON = objectMapper.readValue(new File(classLoader.getResource("mapJSON.json").getFile()), 
						new TypeReference<Map<String, Object>>() {
						}
					);
			
			System.out.println(mapJSON);
			for (Map.Entry<String, Object> entry : mapJSON.entrySet()) {
				System.out.println("key:" + entry.getKey() + " value: " + entry.getValue());
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

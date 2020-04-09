package udemy.json;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class DataBindingWrite {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		//Java POJO Objects
		//Write this to System.out
		UdemyStudent udemyStudent = new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setName("tuna");
		udemyStudent.setLastname("tore");
		
		UdemyStudent udemyStudent2 = new UdemyStudent();
		udemyStudent2.setId(2);
		udemyStudent2.setName("tuna2");
		udemyStudent2.setLastname("tore2");
		
		try {
			System.out.println(objectMapper.writeValueAsString(udemyStudent));
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyStudent));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Object> mapJSON = new LinkedHashMap<String, Object>();
		
		mapJSON.put("key1", "value1");
		mapJSON.put("key2", "value2");
		mapJSON.put("key3", "value3");
		mapJSON.put("booleanTrue", true);
		mapJSON.put("booleanFalse", false);
		mapJSON.put("array", new String[] {"1","2","3"});
		mapJSON.put("arrayObjects", new UdemyStudent[] {udemyStudent, udemyStudent2});
		mapJSON.put("nestedObject", udemyStudent);
		mapJSON.put("integer", 1);
		mapJSON.put("valueNull", null);
		mapJSON.put("list", Arrays.asList("1", "2","3"));
		mapJSON.put("date", LocalDateTime.now().toString());
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapJSON));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/mapJSON.json"), mapJSON);
		} catch (JsonGenerationException e) {
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

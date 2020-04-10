package udemy.json;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyJson;

public class Serializer {

	public static void main(String[] args) {
			
		UdemyJson udemyJson = new UdemyJson();
		udemyJson.setId(1);
		udemyJson.setKey1("value1");
		udemyJson.setKey2("value2");
		udemyJson.setDate(new Date());
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyJson));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

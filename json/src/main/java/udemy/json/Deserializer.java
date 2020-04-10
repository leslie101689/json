package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyJson;

public class Deserializer {

	public static void main(String[] args) {

		ClassLoader classLoader = Deserializer.class.getClassLoader();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			UdemyJson udemyJson = objectMapper.readValue(new File(classLoader.getResource("udemyjson.json").getFile()), UdemyJson.class);
			
			System.out.println("id: " + udemyJson.getId());
			System.out.println("key1: " + udemyJson.getKey1());
			System.out.println("key2: " + udemyJson.getKey2());
			
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

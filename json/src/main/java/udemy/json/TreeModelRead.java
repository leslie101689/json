package udemy.json;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelRead {

	public static void main(String[] args) {

		ClassLoader classLoader = TreeModelRead.class.getClassLoader();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			JsonNode root = objectMapper.readTree(new File(classLoader.getResource("mapJSON.json").getFile()));
			
			JsonNode key1Node = root.get("key1");
			String key1Value = key1Node.asText();
			System.out.println("key1: " + key1Value);
			
			JsonNode key2Node = root.get("key2");
			String key2Value = key2Node.asText();
			System.out.println("key2: " + key2Value);
			
			JsonNode booleanTrue = root.get("booleanTrue");
			String booleanTrueValue = booleanTrue.asText();
			System.out.println("booleanTrue: " + booleanTrueValue);
			
			JsonNode array = root.get("array");
			System.out.println("array isArray() " + array.isArray());
			
			for (JsonNode jsonNode : array) {
				System.out.println("value: " + jsonNode.asText());
			}
			
			JsonNode arrayObjects = root.get("arrayObjects");
			
			for (JsonNode jsonNode : arrayObjects) {
				System.out.println("id: " + jsonNode.get("id").asText() 
						+ " name: " + jsonNode.get("name").asText()
						+ " lastname: " + jsonNode.get("lastname").asText());
			}
			
			JsonNode nestedObject = root.get("nestedObject");
			System.out.println("nestedObject isObject() " + nestedObject.isObject());
			System.out.println("id: " + nestedObject.get("id").asText());
			System.out.println("name: " + nestedObject.get("name").asText());
			System.out.println("lastname: " + nestedObject.get("lastname").asText());
				
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

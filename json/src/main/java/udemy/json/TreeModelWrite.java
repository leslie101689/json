package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TreeModelWrite {

	public static void main(String[] args) {

		try {
			ClassLoader classLoader = TreeModelWrite.class.getClassLoader();
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			JsonNode root = objectMapper.readTree(new File(classLoader.getResource("mapJSON.json").getFile()));
			
			((ObjectNode)root).remove("array");
			((ObjectNode)root).remove("boolenTrue");
			((ObjectNode)root).remove("boolenFalse");
			
			((ObjectNode)root).put("new key", "new value");
			
			((ObjectNode)root).putArray("newArray");
			((ObjectNode)root).withArray("newArray").add("1");
			((ObjectNode)root).withArray("newArray").add("2");
			((ObjectNode)root).withArray("newArray").add("3");
			
			ArrayNode arrayNode = ((ObjectNode)root).withArray("newArray");
			System.out.println(arrayNode);
			
			((ObjectNode)root).withArray("newArray").removeAll();
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}

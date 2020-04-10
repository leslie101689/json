package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class StreamingAPI_JsonParser {

	public static void main(String[] args) {

		JsonFactory jsonFactory = new JsonFactory();
		
		try {
		
			ClassLoader classLoader = StreamingAPI_JsonParser.class.getClassLoader();
		
			JsonParser jsonParser = jsonFactory.createParser(new File(classLoader.getResource("jsongenerator_output.json").getFile()));
			
			while(jsonParser.nextToken() != null) {
				JsonToken token = jsonParser.getCurrentToken();
				
				//System.out.println(token);
				
				if(token.equals(JsonToken.FIELD_NAME)) {
					String fieldName = jsonParser.getCurrentName();
					jsonParser.nextToken();
					
					if(fieldName.equals("object")) {
						//if it contains an object
						while(jsonParser.nextToken() != JsonToken.END_OBJECT) {
							String nameField = jsonParser.getCurrentName();
							jsonParser.nextToken(); // move to the value
							if(nameField.equals("id")) {
								System.out.println("id: " + jsonParser.getValueAsString());
							} else if(nameField.equals("name")) {
								System.out.println("name: " + jsonParser.getValueAsString());
							} else if(nameField.equals("lastname")) {
								System.out.println("lastname: " + jsonParser.getValueAsString());
							}
						}
					}
					
					if(fieldName.equals("array")) {
						while(jsonParser.nextToken() != JsonToken.END_ARRAY) {
							if(jsonParser.getCurrentToken().equals(JsonToken.START_OBJECT)) {
								while(jsonParser.nextToken() != JsonToken.END_OBJECT) {
									jsonParser.nextToken();
									System.out.println(jsonParser.getValueAsString());
								}
							} else {
								System.out.println(jsonParser.getValueAsString());
							}
						}
					}
					
				}
				
			}
			
			jsonParser.close();
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

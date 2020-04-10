package udemy.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class StreamingAPI_JsonGenerator {

	public static void main(String[] args) {

		try {
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			JsonFactory jsonFactory = new JsonFactory();
			
			JsonGenerator jsonGenerator = jsonFactory.createGenerator(System.out);
				
			jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
			jsonGenerator.setCodec(objectMapper);
		
			jsonGenerator.writeStartObject(); //JSON Start object {
			
			jsonGenerator.writeFieldName("id");
			jsonGenerator.writeString("1234");
			
			jsonGenerator.writeFieldName("id2");
			jsonGenerator.writeString("1234");
			
			jsonGenerator.writeStringField("name", "tuna");
			
			UdemyStudent udemyStudent = new UdemyStudent();
			udemyStudent.setId(1);
			udemyStudent.setName("udemy student name");
			udemyStudent.setLastname("udemy student lastname");
			
			jsonGenerator.writeFieldName("object");
			jsonGenerator.writeObject(udemyStudent);
			
			jsonGenerator.writeFieldName("array");
			jsonGenerator.writeStartArray();
			jsonGenerator.writeString("1");
			jsonGenerator.writeString("2");
			jsonGenerator.writeString("3");			
			jsonGenerator.writeEndArray();
			
			jsonGenerator.writeEndObject(); //end json
			
			jsonGenerator.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}

package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import udemy.json.domain.UdemyLectureSchema;

public class JsonSchemaValidator {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyLectureSchema udemyLectureSchema = new UdemyLectureSchema();
		udemyLectureSchema.setId(1);
		udemyLectureSchema.setName("udemy lecture name");
		udemyLectureSchema.setNameLine2("");
		udemyLectureSchema.setDescription("udemy lecture desc");
		udemyLectureSchema.setEnabled(true);
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyLectureSchema));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			ClassLoader classLoader = JsonSchemaValidator.class.getClassLoader();
		
			JsonNode rootSchema = objectMapper.readTree(new File(classLoader.getResource("schema.json").getFile()));
			
			JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder().freeze();

			JsonSchema schema = jsonSchemaFactory.getJsonSchema(rootSchema);
			
			JsonNode validate = objectMapper.readTree(new File(classLoader.getResource("udemylecturevalidate.json").getFile()));
			
			System.out.println(schema.validate(validate));
			
		} catch (ProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

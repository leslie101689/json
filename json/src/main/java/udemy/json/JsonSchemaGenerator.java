package udemy.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

import udemy.json.domain.UdemyLectureSchema;

public class JsonSchemaGenerator {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		SchemaFactoryWrapper wrapper = new SchemaFactoryWrapper();
		
		try {
			
			objectMapper.acceptJsonFormatVisitor(objectMapper.constructType(UdemyLectureSchema.class), wrapper);
			com.fasterxml.jackson.module.jsonSchema.JsonSchema jsonSchema = wrapper.finalSchema();
			jsonSchema.set$schema("http://json-schema.org/draft-03/schema#");
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));			
		} catch ( JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

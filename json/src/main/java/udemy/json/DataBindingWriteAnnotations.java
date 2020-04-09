package udemy.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyLecture;
import udemy.json.domain.UdemyLecture.FREE_PREVIEW;
import udemy.json.domain.UdemyLecture.QuizQuestion;

public class DataBindingWriteAnnotations {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyLecture udemyLecture = new UdemyLecture();
		udemyLecture.setId(1);
		udemyLecture.setName("json udemy course");
		//udemyLecture.setNameLine2("json udemy name line 2");
		udemyLecture.setDescription("json udemy course description");
		udemyLecture.setEnabled(true);
		udemyLecture.setIgnore("");
		udemyLecture.setIgnore2("");
		
		QuizQuestion quizQuestion = udemyLecture. new QuizQuestion();
		quizQuestion.setId(1);
		quizQuestion.setQuestion("What is JSON?");
		quizQuestion.setAnswer("JSON is a data interchange format");
		
		udemyLecture.getListQuestions().add(quizQuestion);
		udemyLecture.setFree_preview(FREE_PREVIEW.FREE_PREVIEW_NOT_ENABLED);
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyLecture));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 *  {
			  "id" : 1,
			  "name" : "json udemy course",
			  "nameLine2" : "json udemy name line 2",
			  "description" : "json udemy course description",
			  "enabled" : false,
			  "free_preview" : "FREE_PREVIEW_NOT_ENABLED",
			  "listQuestions" : [ {
			    "id" : 1,
			    "question" : "What is JSON?",
			    "answer" : "JSON is a data interchange format"
			  } ]
			} 
		 */

	}

}

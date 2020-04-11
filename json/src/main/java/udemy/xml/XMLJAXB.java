package udemy.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class XMLJAXB {

	public static void main(String[] args) {
		
		XmlMapper xmlObjectMapper = new XmlMapper();
		xmlObjectMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector(xmlObjectMapper.getTypeFactory()));
		
		//xmlObjectMapper.registerModule(new JaxbAnnotationModule());
		
		try {
			System.out.println(xmlObjectMapper.writeValueAsString(new XML()));
			
			XML xml = xmlObjectMapper.readValue("<xml attribute=\"attribute value\"><name>tuna tore</name><name2/><name4/></xml>", XML.class);
			
			System.out.println("attribute: " + xml.getAttribute());
			System.out.println("property1: " + xml.getProperty1());
			System.out.println("property2: " + xml.getProperty2());
			System.out.println("property4: " + xml.getProperty4());
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

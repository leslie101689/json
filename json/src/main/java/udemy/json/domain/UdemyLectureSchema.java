package udemy.json.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class UdemyLectureSchema {

	@JsonPropertyDescription(value="id of the field")
	private long id;
	
	@JsonPropertyDescription(value="name of the field and required")
	@JsonProperty(required=true)
	private String name;
	
	@JsonProperty(required=true)
	@JsonPropertyDescription(value="nameline 2 of the field and required")
	private String nameLine2;
	
	@JsonProperty("Description")
	private String description;
	
	private boolean enabled;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLine2() {
		return nameLine2;
	}

	public void setNameLine2(String nameLine2) {
		this.nameLine2 = nameLine2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}

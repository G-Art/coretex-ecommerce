package com.coretex.newpost.api.enchiridion.data.values;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CargoDescriptionValue {

	@JsonProperty(value = "Ref")
	private String reference;

	@JsonProperty(value = "Description")
	private String description;

	@JsonProperty(value = "DescriptionRu")
	private String descriptionRu;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionRu() {
		return descriptionRu;
	}

	public void setDescriptionRu(String descriptionRu) {
		this.descriptionRu = descriptionRu;
	}
}

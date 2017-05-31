package com.agco.json.generate.integration;

import java.util.ArrayList;
import java.util.List;

import com.agco.json.generate.entity.ErrorSource;
import com.agco.json.generate.entity.Meta;
import com.agco.json.generate.entity.Source;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW14 - Error", description = "Receive error messages for each queue")
public class BKW14Error {

	private List<ErrorSource> errors;

	@Attributes(required = true)
	private Meta meta;

	public BKW14Error() {
		
		this.meta = new Meta();
		this.errors = new ArrayList<ErrorSource>();
				
		List<Source> listOfSource = new ArrayList<Source>();
		listOfSource.add(new Source());
		
		ErrorSource errorSource = new ErrorSource();
		errorSource.setSource(listOfSource);
		
		this.errors.add(errorSource);
		
	}

	public List<ErrorSource> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorSource> errors) {
		this.errors = errors;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}

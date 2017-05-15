package com.agco.json.generate.integration;

import com.agco.json.generate.entity.MetaData;
import com.agco.json.generate.entity.SuperSession;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW07 - SuperSession", description = "Send supersession information from AGCO to Barkawi")
public class BKW07SuperSession {

	@Attributes(required = true)
	private SuperSession data;

	private MetaData meta;

	public BKW07SuperSession() {
		this.setData(new SuperSession());
		this.setMeta(new MetaData());
	}

	public SuperSession getData() {
		return data;
	}

	public void setData(SuperSession data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

}

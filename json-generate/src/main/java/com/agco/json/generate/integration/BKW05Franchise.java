package com.agco.json.generate.integration;

import com.agco.json.generate.entity.Franchise;
import com.agco.json.generate.entity.MetaData;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW05 - Franchise", description = "Send items franchise from AGCO to Barkawi")
public class BKW05Franchise {

	private Franchise data;
	private MetaData meta;

	public Franchise getData() {
		return data;
	}

	public void setData(Franchise data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

}
